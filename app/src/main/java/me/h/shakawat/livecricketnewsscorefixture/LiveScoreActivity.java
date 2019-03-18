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

import me.h.shakawat.livecricketnewsscorefixture.Interface.ItemClickListener;
import me.h.shakawat.livecricketnewsscorefixture.Model.LiveScore;
import me.h.shakawat.livecricketnewsscorefixture.ViewHolder.LiveScoreViewHolder;

public class LiveScoreActivity extends AppCompatActivity {


    RecyclerView liveScoreRecyclerView;

    FirebaseDatabase lcDB;
    DatabaseReference liveScoreDF;
    FirebaseRecyclerOptions<LiveScore> options;
    FirebaseRecyclerAdapter<LiveScore,LiveScoreViewHolder> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_score);


        Toolbar toolbar = (Toolbar) findViewById(R.id.liveScoreToolBarId);
        toolbar.setTitle("Live Match");
        setSupportActionBar(toolbar);

        /////for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        lcDB = FirebaseDatabase.getInstance();
        liveScoreDF = lcDB.getReference("LiveScore");

        liveScoreRecyclerView = findViewById(R.id.liveScoreRecyclerViewId);
        liveScoreRecyclerView.setHasFixedSize(true);


        loadLiveScore();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        liveScoreRecyclerView.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setReverseLayout(true);
        linearLayoutManager.setStackFromEnd(true);
        adapter.startListening();
        liveScoreRecyclerView.setAdapter(adapter);

    }

    private void loadLiveScore() {

        options = new FirebaseRecyclerOptions.Builder<LiveScore>()
                .setQuery(liveScoreDF,LiveScore.class)
                .build();

        adapter = new FirebaseRecyclerAdapter<LiveScore, LiveScoreViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull LiveScoreViewHolder holder, int position, @NonNull LiveScore model) {

                holder.txtStreming.setText(model.getStreming());
                holder.txtMatchName.setText(model.getMatchName());
                holder.txtTeam1.setText(model.getTeam1());
                holder.txtTeam2.setText(model.getTeam2());
                holder.txtResult.setText(model.getResult());
                holder.txtBatshman1.setText(model.getBatshman1());
                holder.txtBatshman2.setText(model.getBatshman2());
                holder.txtBallar1.setText(model.getBallar1());
                holder.txtBallar2.setText(model.getBallar2());

                holder.setItemClickListener(new ItemClickListener() {
                    @Override
                    public void onClick(View v, int position, boolean isLongClick) {
                        ////for fixt crush
                    }
                });

            }

            @NonNull
            @Override
            public LiveScoreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.live_score_layout,parent,false);
                return  new LiveScoreViewHolder(v);
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
