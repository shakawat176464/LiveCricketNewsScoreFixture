package me.h.shakawat.livecricketnewsscorefixture.T10_Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import me.h.shakawat.livecricketnewsscorefixture.Model.WorldCup;
import me.h.shakawat.livecricketnewsscorefixture.R;
import me.h.shakawat.livecricketnewsscorefixture.ViewHolder.WorldCupRecyclerView;

/**
 * A simple {@link Fragment} subclass.
 */
public class T10_Fixture_Fragment extends Fragment {


    private View view;
    private RecyclerView mRecyclerView;
    private List<WorldCup> lstWorldCup;

    public T10_Fixture_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_t10__fixture_, container, false);
        mRecyclerView = view.findViewById(R.id.t10_fixture_RecyclerViewId);

        WorldCupRecyclerView worldCupRecyclerView = new WorldCupRecyclerView(getContext(),lstWorldCup);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(worldCupRecyclerView);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstWorldCup = new ArrayList<>();
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :01","Karachians Vs Rajputs","21 November,2018","Time : 08:30 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :02","Kerala Kings Vs Pakhtoons","21 November,2018","Time : 10:45 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :03","Karachians Vs Kerala Kings","22 November,2018","Time : 05:30 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :04","Pakhtoons Vs Rajputs","22 November,2018","Time : 07:45 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :05","Maratha Arabians Vs Punjabi Legends","22 November,2018","Time : 10:00 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :06","Pakhtoons Vs Rajputs","23 November,2018","Time : 05:30 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :07","Bengal Tigers Vs Maratha Arabians","23 November,2018","Time : 07:45 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :08","Northern Warriors Vs Punjabi Legends","23 November,2018","Time : 10:00 PM +06 ","Sharjah Cricket Stadium, Sharjah"));


        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :09","Karachians Vs Karachians","24 November,2018","Time : 08:30 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :10","Bengal Tigers Vs Punjabi Legends","24 November,2018","Time : 10:45 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :11","Kerala Kings Vs Rajputs","25 November,2018","Time : 08:30 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :12","Maratha Arabians Vs Northern Warriors","25 November,2018","Time : 10:45 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :13","TBA Vs TBA","26 November,2018","Time : 08:30 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :14","TBA Vs TBA","26 November,2018","Time : 10:45 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :15","TBA Vs TBA","27 November,2018","Time : 08:30 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :16","TBA Vs TBA","27 November,2018","Time : 10:45 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :17","TBA Vs TBA","28 November,2018","Time : 08:30 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :18","TBA Vs TBA","28 November,2018","Time : 10:45 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :19","TBA Vs TBA","29 November,2018","Time : 05:30 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :20","TBA Vs TBA","29 November,2018","Time : 07:45 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :21","TBA Vs TBA","29 November,2018","Time : 10:00 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :22","TBA Vs TBA","30 November,2018","Time : 05:30 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :23","TBA Vs TBA","30 November,2018","Time : 07:45 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :24","TBA Vs TBA","30 November,2018","Time : 10:00 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Qualifier Final","TBA Vs TBA","1 December,2018","Time : 05:30 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Eliminator Final","TBA Vs TBA","1 December,2018","Time : 07:45 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Eliminator Final","TBA Vs TBA","1 December,2018","Time : 10:00 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"3rd Place Play-off","TBA Vs TBA","2 December,2018","Time : 07:45 PM +06 ","Sharjah Cricket Stadium, Sharjah"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"T10 Final","TBA Vs TBA","2 December,2018","Time : 10:00 PM +06 ","Sharjah Cricket Stadium, Sharjah"));

    }

}
