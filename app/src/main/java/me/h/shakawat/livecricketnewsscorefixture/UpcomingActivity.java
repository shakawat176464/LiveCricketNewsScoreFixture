package me.h.shakawat.livecricketnewsscorefixture;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

import me.h.shakawat.livecricketnewsscorefixture.Interface.ItemClickListener;
import me.h.shakawat.livecricketnewsscorefixture.Model.UpComingMatch;
import me.h.shakawat.livecricketnewsscorefixture.ViewHolder.UpComingViewHolder;

public class UpcomingActivity extends AppCompatActivity {

    RecyclerView upcomingMatchRecyclerView;

    FirebaseDatabase upcomingMatchFD;
    DatabaseReference upcomingMatchDF;
    FirebaseRecyclerOptions<UpComingMatch> options;
    FirebaseRecyclerAdapter<UpComingMatch,UpComingViewHolder> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming);

        Toolbar toolbar = (Toolbar) findViewById(R.id.upcomingMatchToolBarId);
        toolbar.setTitle("Upcoming Match");
        setSupportActionBar(toolbar);

        /////for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        upcomingMatchFD = FirebaseDatabase.getInstance();
        upcomingMatchDF = upcomingMatchFD.getReference("UpCommingMatch");

        upcomingMatchRecyclerView = findViewById(R.id.upcomingMatchRecyclerViewId);
        upcomingMatchRecyclerView.setHasFixedSize(true);

        loadUpcomingMatch();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        upcomingMatchRecyclerView.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setReverseLayout(true);
        linearLayoutManager.setStackFromEnd(true);
        adapter.startListening();
        upcomingMatchRecyclerView.setAdapter(adapter);

    }


    private void loadUpcomingMatch() {

        options = new FirebaseRecyclerOptions.Builder<UpComingMatch>()
                .setQuery(upcomingMatchDF,UpComingMatch.class)
                .build();

        adapter = new FirebaseRecyclerAdapter<UpComingMatch, UpComingViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull UpComingViewHolder holder, int position, @NonNull UpComingMatch model) {

                holder.txtTeamName.setText(model.getTeamName());
                holder.txtMatchFormat.setText(model.getMatchFormat());
                holder.txtDateTime.setText(model.getDateTime());
                holder.txtStadiumName.setText(model.getStadium());

                Picasso.get()
                        .load(model.getFlagNum1())
                        .into(holder.flagNum1);
                Picasso.get()
                        .load(model.getFlagNum2())
                        .into(holder.flagNum2);

                holder.setItemClickListener(new ItemClickListener() {
                    @Override
                    public void onClick(View v, int position, boolean isLongClick) {
                        ////for fixt crush
                    }
                });

            }

            @NonNull
            @Override
            public UpComingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.upcoming_match_layout,parent,false);
                return  new UpComingViewHolder(v);
            }
        };


    }



    @Override
    protected void onStart() {
        super.onStart();
        if (adapter!=null)
            adapter.startListening();
    }

    @Override
    protected void onResume() {
        if (adapter!=null)
            adapter.startListening();
        super.onResume();
    }

    @Override
    protected void onStop() {
        if (adapter!=null)
            adapter.stopListening();
        super.onStop();
    }



    /////for back button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

}