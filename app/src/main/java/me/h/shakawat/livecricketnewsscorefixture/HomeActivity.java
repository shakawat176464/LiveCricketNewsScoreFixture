package me.h.shakawat.livecricketnewsscorefixture;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

import me.h.shakawat.livecricketnewsscorefixture.Interface.ItemClickListener;
import me.h.shakawat.livecricketnewsscorefixture.Model.News;
import me.h.shakawat.livecricketnewsscorefixture.ViewHolder.NewsViewHolder;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    BottomNavigationView bottomNavigationView;

    RecyclerView recyclerView;
    FirebaseDatabase database;
    DatabaseReference news_reference;
    FirebaseRecyclerOptions<News> options;
    FirebaseRecyclerAdapter<News,NewsViewHolder> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Live Cricket Score News");
        setSupportActionBar(toolbar);

        bottomNavigationView = findViewById(R.id.nav_bottom_id);



        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                switch (id){
                    case R.id.bottom_live_id:
                        startActivity( new Intent(getApplicationContext(),LiveScoreActivity.class));
                        break;
                    case R.id.bottom_recent_id:
                        startActivity( new Intent(getApplicationContext(),RecentActivity.class));
                        break;
                    case R.id.bottom_upcoming_id:
                        startActivity( new Intent(getApplicationContext(),UpcomingActivity.class));
                        break;

                }

                return true;
            }
        });



        database = FirebaseDatabase.getInstance();
        news_reference = database.getReference("AllCricketNews");

        recyclerView = findViewById(R.id.recyclerViewNewsId);
        recyclerView.setHasFixedSize(true);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        options = new FirebaseRecyclerOptions.Builder<News>()
                .setQuery(news_reference,News.class)
                .build();

        adapter = new FirebaseRecyclerAdapter<News,NewsViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull NewsViewHolder holder, int position, @NonNull News model) {

                Picasso.get()
                        .load(model.getImage())
                        .into(holder.news_image);

                holder.txt_time.setText(model.getTime());
                holder.txt_header.setText(model.getHead());

                holder.setItemClickListener(new ItemClickListener() {
                    @Override
                    public void onClick(View v, int position, boolean isLongClick) {
                        ///code later
                        Intent newsDetails = new Intent(getApplicationContext(),NewsDetailsViewActivity.class);
                        newsDetails.putExtra("NewsId",adapter.getRef(position).getKey());
                        startActivity(newsDetails);


                    }
                });

            }

            @NonNull
            @Override
            public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.news_main_item_layout,parent,false);
                return new NewsViewHolder(v);
            }
        };

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setReverseLayout(true);
        linearLayoutManager.setStackFromEnd(true);
        adapter.startListening();
        recyclerView.setAdapter(adapter);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_worldCup_Id) {
            startActivity(new Intent(getApplicationContext(),WorldCup2019Activity.class));
        }
        else if (id == R.id.nav_IPL) {
            startActivity(new Intent(getApplicationContext(),IPL_2019_Activity.class));
        }
        else if (id == R.id.nav_BPL) {
            startActivity(new Intent(getApplicationContext(),BPL_2019_Activity.class));
        }
        else if (id == R.id.nav_PSL) {
            startActivity(new Intent(getApplicationContext(),PSLActivity.class));
        }
        else if (id == R.id.nav_BBL) {
            startActivity(new Intent(getApplicationContext(),BBLActivity.class));
        }
        else if (id == R.id.nav_WBBL) {
            startActivity(new Intent(getApplicationContext(),WBBLActivity.class));
        }
        else if (id == R.id.nav_T10) {
            startActivity(new Intent(getApplicationContext(),T10Activity.class));
        }
        else if (id == R.id.nav_CPL) {
            startActivity(new Intent(getApplicationContext(),CPLActivity.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
