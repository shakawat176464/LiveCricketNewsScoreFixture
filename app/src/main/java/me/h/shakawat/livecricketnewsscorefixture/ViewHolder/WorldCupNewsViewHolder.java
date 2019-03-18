package me.h.shakawat.livecricketnewsscorefixture.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import me.h.shakawat.livecricketnewsscorefixture.Interface.ItemClickListener;
import me.h.shakawat.livecricketnewsscorefixture.R;

public class WorldCupNewsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView worldCup_txt_time,worldCup_txt_header;
    public ImageView worldCup_news_image;

    private ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public WorldCupNewsViewHolder(@NonNull View itemView) {
        super(itemView);

        worldCup_txt_time = itemView.findViewById(R.id.worldCupNewsTimetxtId);
        worldCup_txt_header =itemView.findViewById(R.id.worldCupNewsHeadertxtId);
        worldCup_news_image = itemView.findViewById(R.id.worldCupNewsImgId);

        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false);
    }
}

