package me.h.shakawat.livecricketnewsscorefixture.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import me.h.shakawat.livecricketnewsscorefixture.Interface.ItemClickListener;
import me.h.shakawat.livecricketnewsscorefixture.R;

public class BplNewsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


    public TextView txt_time,txt_header;
    public ImageView news_image;

    private ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }


    public BplNewsViewHolder(@NonNull View itemView) {
        super(itemView);

        txt_time = itemView.findViewById(R.id.bpl_news_txt_date_timeId);
        txt_header =itemView.findViewById(R.id.txt_bpl_news_headerId);
        news_image = itemView.findViewById(R.id.bpl_newsImageId);
        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false);
    }
}

