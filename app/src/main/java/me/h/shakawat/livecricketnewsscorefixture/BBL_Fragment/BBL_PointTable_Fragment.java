package me.h.shakawat.livecricketnewsscorefixture.BBL_Fragment;


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

import me.h.shakawat.livecricketnewsscorefixture.Interface.ItemClickListener;
import me.h.shakawat.livecricketnewsscorefixture.Model.BPL_Point_Table;
import me.h.shakawat.livecricketnewsscorefixture.R;
import me.h.shakawat.livecricketnewsscorefixture.ViewHolder.PointTableViewHolder;

/**
 * A simple {@link Fragment} subclass.
 */
public class BBL_PointTable_Fragment extends Fragment {


    RecyclerView recyclerView;
    FirebaseDatabase database;
    DatabaseReference news_reference;
    FirebaseRecyclerOptions<BPL_Point_Table> options;
    FirebaseRecyclerAdapter<BPL_Point_Table,PointTableViewHolder> adapter;

    public BBL_PointTable_Fragment() {
        // Required empty public constructor
        database = FirebaseDatabase.getInstance();
        news_reference = database.getReference("BBLPointTable");

        options = new FirebaseRecyclerOptions.Builder<BPL_Point_Table>()
                .setQuery(news_reference,BPL_Point_Table.class)
                .build();

        adapter = new FirebaseRecyclerAdapter<BPL_Point_Table,PointTableViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull PointTableViewHolder holder,
                                            int position, @NonNull BPL_Point_Table model) {


                holder.teamN.setText(model.getTe());
                holder.matchN.setText(model.getMa());
                holder.winC.setText(model.getWi());
                holder.lossC.setText(model.getLo());
                holder.tieC.setText(model.getTi());
                holder.pointC.setText(model.getPo());
                holder.nrrCo.setText(model.getNrr());

                holder.setItemClickListener(new ItemClickListener() {
                    @Override
                    public void onClick(View v, int position, boolean isLongClick) {
                        ///code later
                    }
                });
            }

            @NonNull
            @Override
            public PointTableViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.point_table_layout,parent,false);
                return new PointTableViewHolder(v);
            }
        };
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bbl__point_table_, container, false);

        recyclerView = view.findViewById(R.id.bblPointTableRecyclerViewId);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        /*linearLayoutManager.setReverseLayout(true);
        linearLayoutManager.setStackFromEnd(true);*/
        adapter.startListening();
        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);
        return view;
    }

}
