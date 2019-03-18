package me.h.shakawat.livecricketnewsscorefixture.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import me.h.shakawat.livecricketnewsscorefixture.Interface.ItemClickListener;
import me.h.shakawat.livecricketnewsscorefixture.R;

public class TeamNameRecyclerViewHolder extends RecyclerView.Adapter<TeamNameRecyclerViewHolder.MyViewHolder> {

    Context context;

    private String[] teamName={"Australia","India","Pakistan","England",
            "South Africa","West indies","New Zealand","Afghanistan","Sri Lanka","Bangladesh"};

    private int[] teamImg={R.drawable.australia_flag,R.drawable.india_flag,R.drawable.pakistan_flag,
            R.drawable.england_flag,R.drawable.south_africa,R.drawable.west_indies_flag,
            R.drawable.new_zeland_flag,R.drawable.afghanistan_flag,R.drawable.srilanka_flag,R.drawable.bangladesh_flag};

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.team_name_layout,parent,false);

        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.teamNameTxt.setText(teamName[position]);
        holder.teamImg.setImageResource(teamImg[position]);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View v, int position, boolean isLongClick) {
                ///
            }
        });

    }

    @Override
    public int getItemCount() {
        return teamName.length;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView teamImg;
        TextView teamNameTxt;


        private ItemClickListener itemClickListener;

        public void setItemClickListener(ItemClickListener itemClickListener) {
            this.itemClickListener = itemClickListener;
        }

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            teamImg = itemView.findViewById(R.id.teamFlagImageId);
            teamNameTxt = itemView.findViewById(R.id.teamNameTxtId);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            itemClickListener.onClick(v,getAdapterPosition(),false);
        }

    }
}
