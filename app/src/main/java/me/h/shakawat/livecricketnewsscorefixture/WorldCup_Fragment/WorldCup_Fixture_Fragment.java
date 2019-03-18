package me.h.shakawat.livecricketnewsscorefixture.WorldCup_Fragment;


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
public class WorldCup_Fixture_Fragment extends Fragment {


    private View view;
    private RecyclerView mRecyclerView;
    private List<WorldCup> lstWorldCup;

    public WorldCup_Fixture_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_world_cup__fixture_, container, false);
        mRecyclerView = view.findViewById(R.id.worldCup_fixture_RecyclerViewId);

        WorldCupRecyclerView worldCupRecyclerView = new WorldCupRecyclerView(getContext(),lstWorldCup);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(worldCupRecyclerView);

        return view;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstWorldCup = new ArrayList<>();
        lstWorldCup.add(new WorldCup(R.drawable.england_flag,R.drawable.south_africa,"Play No :01","England Vs South Africa","30May,2019","Time : 3.30PM +06","Kennington Oval, London"));
        lstWorldCup.add(new WorldCup(R.drawable.pakistan_flag,R.drawable.west_indies_flag,"Play No :02","Pakistan Vs West indies","31May,2019","Time : 3.30PM +06","Trent Bridge, Nottingham"));
        lstWorldCup.add(new WorldCup(R.drawable.new_zeland_flag,R.drawable.srilanka_flag,"Play No :03","New Zealand Vs Sri Lanka","1June,2019","Time : 3.30PM +06","Sophia Gardens, Cardiff"));
        lstWorldCup.add(new WorldCup(R.drawable.afghanistan_flag,R.drawable.australia_flag,"Play No :04","Afghanistan Vs Australia","1June,2019","Time : 6.30PM +06","County Ground, Bristol"));
        lstWorldCup.add(new WorldCup(R.drawable.bangladesh_flag,R.drawable.south_africa,"Play No :05","Bangladesh Vs South Africa","2June,2019","Time : 3.30PM +06","Kennington Oval, London"));
        lstWorldCup.add(new WorldCup(R.drawable.england_flag,R.drawable.pakistan_flag,"Play No :06","England Vs Pakistan","3June,2019","Time : 3.30PM +06","Trent Bridge, Nottingham"));
        lstWorldCup.add(new WorldCup(R.drawable.afghanistan_flag,R.drawable.srilanka_flag,"Play No :07","Afghanistan Vs Sri Lanka","4June,2019","Time : 3.30PM +06","Sophia Gardens, Cardiff"));
        lstWorldCup.add(new WorldCup(R.drawable.india_flag,R.drawable.south_africa,"Play No :08","India Vs South Africa","5June,2019","Time : 3.30PM +06","The Rose Bowl, Southampton"));
        lstWorldCup.add(new WorldCup(R.drawable.bangladesh_flag,R.drawable.new_zeland_flag,"Play No :09","Bangladesh Vs New Zealand","5June,2019","Time : 6.30PM +06","Kennington Oval, London"));
        lstWorldCup.add(new WorldCup(R.drawable.australia_flag,R.drawable.west_indies_flag,"Play No :10","Australia Vs West indies","6June,2019","Time : 3.30PM +06","Trent Bridge, Nottingham"));
        lstWorldCup.add(new WorldCup(R.drawable.pakistan_flag,R.drawable.srilanka_flag,"Play No :11","Pakistan Vs Sri Lanka","7June,2019","Time : 3.30PM +06","County Ground, Bristol"));
        lstWorldCup.add(new WorldCup(R.drawable.england_flag,R.drawable.bangladesh_flag,"Play No :12","England Vs Bangladesh","8June,2019","Time : 3.30PM +06","Sophia Gardens, Cardiff"));
        lstWorldCup.add(new WorldCup(R.drawable.afghanistan_flag,R.drawable.new_zeland_flag,"Play No :13","Afghanistan Vs New Zealand","8June,2019","Time : 6.30PM +06","The Cooper Associates County Ground, Taunton"));
        lstWorldCup.add(new WorldCup(R.drawable.australia_flag,R.drawable.india_flag,"Play No :14","Australia Vs India","9June,2019","Time : 3.30PM +06","Kennington Oval, London"));
        lstWorldCup.add(new WorldCup(R.drawable.south_africa,R.drawable.west_indies_flag,"Play No :15","South Africa Vs West indies","10June,2019","Time : 3.30PM +06","The Rose Bowl, Southampton"));
        lstWorldCup.add(new WorldCup(R.drawable.bangladesh_flag,R.drawable.srilanka_flag,"Play No :16","Bangladesh Vs Sri Lanka","11June,2019","Time : 3.30PM +06","County Ground, Bristol"));
        lstWorldCup.add(new WorldCup(R.drawable.australia_flag,R.drawable.pakistan_flag,"Play No :17","Australia Vs Pakistan","12June,2019","Time : 3.30PM +06","The Cooper Associates County Ground, Taunton"));
        lstWorldCup.add(new WorldCup(R.drawable.india_flag,R.drawable.new_zeland_flag,"Play No :18","India Vs New Zealand","13June,2019","Time : 3.30PM +06","Trent Bridge, Nottingham"));
        lstWorldCup.add(new WorldCup(R.drawable.england_flag,R.drawable.west_indies_flag,"Play No :19","England Vs West indies","14June,2019","Time : 3.30PM +06","The Rose Bowl, Southampton"));
        lstWorldCup.add(new WorldCup(R.drawable.australia_flag,R.drawable.srilanka_flag,"Play No :20","Australia Vs Sri Lanka","15June,2019","Time : 3.30PM +06","Kennington Oval, London"));
        lstWorldCup.add(new WorldCup(R.drawable.afghanistan_flag,R.drawable.south_africa,"Play No :21","Afghanistan Vs South Africa","15June,2019","Time : 6.30PM +06","Sophia Gardens, Cardiff"));
        lstWorldCup.add(new WorldCup(R.drawable.india_flag,R.drawable.pakistan_flag,"Play No :22","India Vs Pakistan","16June,2019","Time : 3.30PM +06","Old Trafford, Manchester"));
        lstWorldCup.add(new WorldCup(R.drawable.bangladesh_flag,R.drawable.west_indies_flag,"Play No :23","Bangladesh Vs West indies","17June,2019","Time : 3.30PM +06","The Cooper Associates County Ground, Taunton"));
        lstWorldCup.add(new WorldCup(R.drawable.afghanistan_flag,R.drawable.england_flag,"Play No :24","Afghanistan Vs England","18June,2019","Time : 3.30PM +06","Old Trafford, Manchester"));
        lstWorldCup.add(new WorldCup(R.drawable.new_zeland_flag,R.drawable.south_africa,"Play No :25","New Zealand Vs South Africa","19June,2019","Time : 3.30PM +06","Edgbaston, Birmingham"));
        lstWorldCup.add(new WorldCup(R.drawable.australia_flag,R.drawable.bangladesh_flag,"Play No :26","Australia Vs Bangladesh","20June,2019","Time : 3.30PM +06","Trent Bridge, Nottingham"));
        lstWorldCup.add(new WorldCup(R.drawable.england_flag,R.drawable.srilanka_flag,"Play No :27","England Vs Sri Lanka","21June,2019","Time : 3.30PM +06","Headingley, Leeds"));
        lstWorldCup.add(new WorldCup(R.drawable.afghanistan_flag,R.drawable.india_flag,"Play No :28","Afghanistan Vs India","22June,2019","Time : 3.30PM +06","The Rose Bowl, Southampton"));
        lstWorldCup.add(new WorldCup(R.drawable.new_zeland_flag,R.drawable.west_indies_flag,"Play No :29","New Zealand Vs West indies","22June,2019","Time : 6.30PM +06","Old Trafford, Manchester"));
        lstWorldCup.add(new WorldCup(R.drawable.pakistan_flag,R.drawable.south_africa,"Play No :30","Pakistan Vs South Africa","23June,2019","Time : 3.30PM +06","Kennington Oval, London"));
        lstWorldCup.add(new WorldCup(R.drawable.afghanistan_flag,R.drawable.bangladesh_flag,"Play No :31","Afghanistan Vs Bangladesh","24June,2019","Time : 3.30PM +06","The Rose Bowl, Southampton"));
        lstWorldCup.add(new WorldCup(R.drawable.england_flag,R.drawable.australia_flag,"Play No :32","England Vs Australia","25June,2019","Time : 3.30PM +06","Kennington Oval, London"));
        lstWorldCup.add(new WorldCup(R.drawable.new_zeland_flag,R.drawable.pakistan_flag,"Play No :33","New Zealand Vs Pakistan","26June,2019","Time : 3.30PM +06","Edgbaston, Birmingham"));
        lstWorldCup.add(new WorldCup(R.drawable.india_flag,R.drawable.west_indies_flag,"Play No :34","India Vs West indies","27June,2019","Time : 3.30PM +06","Old Trafford, Manchester"));
        lstWorldCup.add(new WorldCup(R.drawable.south_africa,R.drawable.srilanka_flag,"Play No :35","South Africa Vs Sri Lanka","28June,2019","Time : 3.30PM +06","Riverside Ground, Chester-le-Street"));
        lstWorldCup.add(new WorldCup(R.drawable.afghanistan_flag,R.drawable.pakistan_flag,"Play No :36","Afghanistan Vs Pakistan","29June,2019","Time : 3.30PM +06","Headingley, Leeds"));
        lstWorldCup.add(new WorldCup(R.drawable.australia_flag,R.drawable.new_zeland_flag,"Play No :37","Australia Vs New Zealand","29June,2019","Time : 6.30PM +06","Kennington Oval, London"));
        lstWorldCup.add(new WorldCup(R.drawable.england_flag,R.drawable.india_flag,"Play No :38","England Vs India","30June,2019","Time : 3.30PM +06","Edgbaston, Birmingham"));
        lstWorldCup.add(new WorldCup(R.drawable.srilanka_flag,R.drawable.west_indies_flag,"Play No :39","Sri Lanka Vs West indies","1July,2019","Time : 3.30PM +06","Riverside Ground, Chester-le-Street"));
        lstWorldCup.add(new WorldCup(R.drawable.bangladesh_flag,R.drawable.india_flag,"Play No :40","Bangladesh Vs India","2July,2019","Time : 3.30PM +06","Edgbaston, Birmingham"));
        lstWorldCup.add(new WorldCup(R.drawable.england_flag,R.drawable.new_zeland_flag,"Play No :41","England Vs New Zealand","3July,2019","Time : 3.30PM +06","Riverside Ground, Chester-le-Street"));
        lstWorldCup.add(new WorldCup(R.drawable.afghanistan_flag,R.drawable.west_indies_flag,"Play No :42","Afghanistan Vs West indies","4July,2019","Time : 3.30PM +06","Headingley, Leeds"));
        lstWorldCup.add(new WorldCup(R.drawable.bangladesh_flag,R.drawable.pakistan_flag,"Play No :43","Bangladesh Vs Pakistan","5July,2019","Time : 6.30PM +06","Kennington Oval, London"));
        lstWorldCup.add(new WorldCup(R.drawable.india_flag,R.drawable.srilanka_flag,"Play No :44","India Vs Sri Lanka","6July,2019","Time : 3.30PM +06","Headingley, Leeds"));
        lstWorldCup.add(new WorldCup(R.drawable.australia_flag,R.drawable.south_africa,"Play No :45","Australia Vs South Africa","6July,2019","Time : 6.30PM +06","Old Trafford, Manchester"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"1st Semi-final","TBA Vs TBA","9July,2019","Time : 3.30PM +06","Old Trafford, Manchester"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"2st Semi-final","TBA Vs TBA","11July,2019","Time : 3.30PM +06","Edgbaston, Birmingham"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Final","TBA Vs TBA","14July,2019","Time : 3.30PM +06","Kennington Oval, London"));

    }

}
