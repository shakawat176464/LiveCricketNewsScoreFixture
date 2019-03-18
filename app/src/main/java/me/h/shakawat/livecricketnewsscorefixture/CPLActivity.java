package me.h.shakawat.livecricketnewsscorefixture;

import android.content.Intent;
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
import me.h.shakawat.livecricketnewsscorefixture.Model.News;
import me.h.shakawat.livecricketnewsscorefixture.ViewHolder.NewsViewHolder;

public class CPLActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FirebaseDatabase database;
    DatabaseReference news_reference;
    FirebaseRecyclerOptions<News> options;
    FirebaseRecyclerAdapter<News,NewsViewHolder> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpl);

        Toolbar toolbar = (Toolbar) findViewById(R.id.cplToolBarId);
        toolbar.setTitle("CPL News");
        setSupportActionBar(toolbar);


        /////for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        database = FirebaseDatabase.getInstance();
        news_reference = database.getReference("CPLNews");

        recyclerView = findViewById(R.id.cplRecyclerViewId);
        recyclerView.setHasFixedSize(true);


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
                        Intent newsDetails = new Intent(getApplicationContext(),CPLNewsDetailsActivity.class);
                        newsDetails.putExtra("CPLNewsID",adapter.getRef(position).getKey());
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
