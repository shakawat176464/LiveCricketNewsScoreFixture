package me.h.shakawat.livecricketnewsscorefixture.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import me.h.shakawat.livecricketnewsscorefixture.Interface.ItemClickListener;
import me.h.shakawat.livecricketnewsscorefixture.R;

public class UpComingViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtTeamName,txtMatchFormat,txtDateTime,txtStadiumName;
    public ImageView flagNum1,flagNum2;

    private ItemClickListener itemClickListener;


    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;

    }

    public UpComingViewHolder(@NonNull View itemView) {
        super(itemView);

        flagNum1 = itemView.findViewById(R.id.flagNum_1_imageViewId);
        flagNum2 = itemView.findViewById(R.id.flagNum_2_imageView_Id);

        txtTeamName = itemView.findViewById(R.id.teamNameTxt_Id);
        txtMatchFormat = itemView.findViewById(R.id.matchFormatTxt_Id);
        txtDateTime = itemView.findViewById(R.id.dateTimeTextView_Id);
        txtStadiumName = itemView.findViewById(R.id.stadiumNameTextView_Id);

        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
