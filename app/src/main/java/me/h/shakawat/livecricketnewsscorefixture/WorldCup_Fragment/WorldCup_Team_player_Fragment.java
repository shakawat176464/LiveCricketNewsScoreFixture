package me.h.shakawat.livecricketnewsscorefixture.WorldCup_Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.h.shakawat.livecricketnewsscorefixture.Adapter.TeamNameRecyclerViewHolder;
import me.h.shakawat.livecricketnewsscorefixture.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WorldCup_Team_player_Fragment extends Fragment {


    RecyclerView teamNameRecyclerView;

    public WorldCup_Team_player_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_world_cup__team_player_, container, false);

        teamNameRecyclerView = v.findViewById(R.id.teamNameImageRecyclerId);
        teamNameRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        TeamNameRecyclerViewHolder teamNameRecyclerViewHolder = new TeamNameRecyclerViewHolder();

        teamNameRecyclerView.setAdapter(teamNameRecyclerViewHolder);

        return v;
    }

}
