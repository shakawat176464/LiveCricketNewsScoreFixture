package me.h.shakawat.livecricketnewsscorefixture.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import me.h.shakawat.livecricketnewsscorefixture.Interface.ItemClickListener;
import me.h.shakawat.livecricketnewsscorefixture.R;

public class PointTableViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView teamN,matchN,winC,lossC,tieC,pointC,nrrCo;

    private ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public PointTableViewHolder(@NonNull View itemView) {
        super(itemView);

        teamN = itemView.findViewById(R.id.txtTeamNameId);
        matchN =itemView.findViewById(R.id.txtMatchCountId);
        winC =itemView.findViewById(R.id.txtWinCountId);
        lossC =itemView.findViewById(R.id.txtLossCountId);
        tieC =itemView.findViewById(R.id.txtTieCountId);
        pointC =itemView.findViewById(R.id.txtPintCountId);
        nrrCo =itemView.findViewById(R.id.txtNRRCountId);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false);
    }
}
