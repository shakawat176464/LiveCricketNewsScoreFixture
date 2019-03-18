package me.h.shakawat.livecricketnewsscorefixture.PSL_Fragment;


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

import me.h.shakawat.livecricketnewsscorefixture.BplNewsDetailsActivity;
import me.h.shakawat.livecricketnewsscorefixture.Interface.ItemClickListener;
import me.h.shakawat.livecricketnewsscorefixture.Model.BplNews;
import me.h.shakawat.livecricketnewsscorefixture.PSLNewsDetailsActivity;
import me.h.shakawat.livecricketnewsscorefixture.R;
import me.h.shakawat.livecricketnewsscorefixture.ViewHolder.BplNewsViewHolder;

/**
 * A simple {@link Fragment} subclass.
 */
public class PSL_News_Fragment extends Fragment {

    RecyclerView pslRecyclerView;
    FirebaseDatabase pslDatabase;
    DatabaseReference pslNews_reference;
    FirebaseRecyclerOptions<BplNews> options;
    FirebaseRecyclerAdapter<BplNews,BplNewsViewHolder> adapter;

    public PSL_News_Fragment() {
        // Required empty public constructor
        pslDatabase = FirebaseDatabase.getInstance();
        pslNews_reference = pslDatabase.getReference("PSLNews");

        options = new FirebaseRecyclerOptions.Builder<BplNews>()
                .setQuery(pslNews_reference,BplNews.class)
                .build();

        adapter = new FirebaseRecyclerAdapter<BplNews,BplNewsViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull BplNewsViewHolder holder, int position, @NonNull BplNews model) {

                Picasso.get()
                        .load(model.getImage())
                        .into(holder.news_image);

                holder.txt_time.setText(model.getTime());
                holder.txt_header.setText(model.getHead());

                holder.setItemClickListener(new ItemClickListener() {
                    @Override
                    public void onClick(View v, int position, boolean isLongClick) {
                        ///code later
                        Intent newsDetails = new Intent(getContext(),PSLNewsDetailsActivity.class);
                        newsDetails.putExtra("PSLNewsID",adapter.getRef(position).getKey());
                        startActivity(newsDetails);

                    }
                });
            }

            @NonNull
            @Override
            public BplNewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.bpl_news_layout,parent,false);
                return new BplNewsViewHolder(v);
            }
        };
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_psl__news_, container, false);

        pslRecyclerView = view.findViewById(R.id.pslNewsRecyclerViewId);
        pslRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        pslRecyclerView.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setReverseLayout(true);
        linearLayoutManager.setStackFromEnd(true);
        adapter.startListening();
        pslRecyclerView.setAdapter(adapter);
        return view;
    }

}
