package me.h.shakawat.livecricketnewsscorefixture.BBL_Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

import me.h.shakawat.livecricketnewsscorefixture.BBLNewsDetailsActivity;
import me.h.shakawat.livecricketnewsscorefixture.Interface.ItemClickListener;
import me.h.shakawat.livecricketnewsscorefixture.Model.WorldCupNews;
import me.h.shakawat.livecricketnewsscorefixture.R;
import me.h.shakawat.livecricketnewsscorefixture.ViewHolder.WorldCupNewsViewHolder;
import me.h.shakawat.livecricketnewsscorefixture.WorldCupNewsDetailsActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class BBL_News_Fragment extends Fragment {


    RecyclerView bblRecyclerView;
    FirebaseDatabase database;
    DatabaseReference news_reference;
    FirebaseRecyclerOptions<WorldCupNews> options;
    FirebaseRecyclerAdapter<WorldCupNews,WorldCupNewsViewHolder> adapter;

    public BBL_News_Fragment() {
        // Required empty public constructor
        database = FirebaseDatabase.getInstance();
        news_reference = database.getReference("BBLNews");

        options = new FirebaseRecyclerOptions.Builder<WorldCupNews>()
                .setQuery(news_reference,WorldCupNews.class)
                .build();

        adapter = new FirebaseRecyclerAdapter<WorldCupNews,WorldCupNewsViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull WorldCupNewsViewHolder holder, int position, @NonNull WorldCupNews model) {

                Picasso.get()
                        .load(model.getImage())
                        .into(holder.worldCup_news_image);

                holder.worldCup_txt_time.setText(model.getTime());
                holder.worldCup_txt_header.setText(model.getHead());

                holder.setItemClickListener(new ItemClickListener() {
                    @Override
                    public void onClick(View v, int position, boolean isLongClick) {
                        ///for fixt crash
                        Intent newsDetails = new Intent(getContext(),BBLNewsDetailsActivity.class);
                        newsDetails.putExtra("BBLNewsID",adapter.getRef(position).getKey());
                        startActivity(newsDetails);

                    }
                });
            }

            @NonNull
            @Override
            public WorldCupNewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.worldcup_news_layout,parent,false);
                return new WorldCupNewsViewHolder(v);
            }
        };
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bbl__news_, container, false);

        bblRecyclerView = view.findViewById(R.id.bblNewsRecyclerViewId);
        bblRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        bblRecyclerView.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setReverseLayout(true);
        linearLayoutManager.setStackFromEnd(true);
        adapter.startListening();
        bblRecyclerView.setAdapter(adapter);
        return view;
    }


    @Override
    public void onStart() {
        super.onStart();
        if (adapter!=null)
            adapter.startListening();
    }

    @Override
    public void onResume() {
        if (adapter!=null)
            adapter.startListening();
        super.onResume();
    }

    @Override
    public void onStop() {
        if (adapter!=null)
            adapter.stopListening();
        super.onStop();
    }

}
