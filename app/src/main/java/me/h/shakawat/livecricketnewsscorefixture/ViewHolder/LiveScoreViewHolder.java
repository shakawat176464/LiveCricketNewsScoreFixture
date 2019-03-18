package me.h.shakawat.livecricketnewsscorefixture.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import me.h.shakawat.livecricketnewsscorefixture.Interface.ItemClickListener;
import me.h.shakawat.livecricketnewsscorefixture.R;

public class LiveScoreViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtStreming,txtMatchName,txtTeam1,txtTeam2,txtResult,txtBatshman1,txtBatshman2,txtBallar1,txtBallar2;

    private ItemClickListener itemClickListener;


    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public LiveScoreViewHolder(@NonNull View itemView) {
        super(itemView);

        txtStreming = itemView.findViewById(R.id.txtMatchLiveStremingId);
        txtMatchName = itemView.findViewById(R.id.txtMatchNameId);
        txtTeam1 = itemView.findViewById(R.id.txtTeam1Id);
        txtTeam2 = itemView.findViewById(R.id.txtTeam2Id);
        txtResult = itemView.findViewById(R.id.txtResultId);
        txtBatshman1 = itemView.findViewById(R.id.txtBatsman1Id);
        txtBatshman2 = itemView.findViewById(R.id.txtBatsman2Id);
        txtBallar1 = itemView.findViewById(R.id.txtBallar1Id);
        txtBallar2 = itemView.findViewById(R.id.txtBallar2Id);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false);
    }
}
