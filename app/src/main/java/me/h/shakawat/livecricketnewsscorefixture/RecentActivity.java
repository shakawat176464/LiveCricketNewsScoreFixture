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
import me.h.shakawat.livecricketnewsscorefixture.Model.RecentMatch;
import me.h.shakawat.livecricketnewsscorefixture.ViewHolder.RecentViewHolder;

public class RecentActivity extends AppCompatActivity {


    RecyclerView recentMatchRecyclerView;

    FirebaseDatabase recentMatchFD;
    DatabaseReference recentMatchDF;
    FirebaseRecyclerOptions<RecentMatch> options;
    FirebaseRecyclerAdapter<RecentMatch,RecentViewHolder> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent);


        Toolbar toolbar = (Toolbar) findViewById(R.id.recentMatchToolBarId);
        toolbar.setTitle("Recent Match");
        setSupportActionBar(toolbar);

        /////for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        recentMatchFD = FirebaseDatabase.getInstance();
        recentMatchDF = recentMatchFD.getReference("RecentMatch");

        recentMatchRecyclerView = findViewById(R.id.recentMatchRecyclerViewId);
        recentMatchRecyclerView.setHasFixedSize(true);



        loadRecentMatch();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recentMatchRecyclerView.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setReverseLayout(true);
        linearLayoutManager.setStackFromEnd(true);
        adapter.startListening();
        recentMatchRecyclerView.setAdapter(adapter);

    }

    private void loadRecentMatch() {

        options = new FirebaseRecyclerOptions.Builder<RecentMatch>()
                .setQuery(recentMatchDF,RecentMatch.class)
                .build();

        adapter = new FirebaseRecyclerAdapter<RecentMatch, RecentViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull RecentViewHolder holder, int position, @NonNull RecentMatch model) {

                holder.txtTeamName.setText(model.getTeamName());
                holder.txtMatchFormat.setText(model.getMatchFormat());
                holder.txtDateTime.setText(model.getDateTime());
                holder.txtMatchStatus.setText(model.getMatchStatus());
                holder.txtMatchResult.setText(model.getMatchResult());
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
            public RecentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.recent_match_layout,parent,false);
                return  new RecentViewHolder(v);
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
