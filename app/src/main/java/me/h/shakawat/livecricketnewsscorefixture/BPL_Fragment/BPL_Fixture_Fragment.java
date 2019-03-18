package me.h.shakawat.livecricketnewsscorefixture.BPL_Fragment;


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
public class BPL_Fixture_Fragment extends Fragment {


    private View view;
    private RecyclerView mRecyclerView;
    private List<WorldCup> lstWorldCup;

    public BPL_Fixture_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_bpl__fixture_, container, false);
        mRecyclerView = view.findViewById(R.id.bpl_fixture_RecyclerViewId);

        WorldCupRecyclerView worldCupRecyclerView = new WorldCupRecyclerView(getContext(),lstWorldCup);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(worldCupRecyclerView);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstWorldCup = new ArrayList<>();
        lstWorldCup.add(new WorldCup(R.drawable.sylhet,R.drawable.dhaka,"Play No :01","Sylhet Sixers Vs Dhaka Dynamites","5January,2019","Time : 2.00PM ","Sylhet International Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.rajshahi,R.drawable.ranglur,"Play No :02","Rajshahi Kings Vs Rangpur Riders","5January,2019","Time : 7.00PM ","Sylhet International Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.sylhet,R.drawable.comilla,"Play No :03","Sylhet Sixers Vs Comilla Victorians","6January,2019","Time : 2.00PM ","Sylhet International Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.khulna,R.drawable.dhaka,"Play No :04","Khulna Titans Vs Dhaka Dynamites","6January,2019","Time : 7.00PM ","Sylhet International Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.chittagang,R.drawable.comilla,"Play No :05","Chittagong Vikings Vs Comilla Victorians","7January,2019","Time : 2.00PM ","Sylhet International Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.sylhet,R.drawable.rajshahi,"Play No :06","Sylhet Sixers Vs Rajshahi Kings","7January,2019","Time : 7.00PM ","Sylhet International Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.ranglur,R.drawable.chittagang,"Play No :07","Rangpur Riders Vs Chittagong Vikings","8January,2019","Time : 2.00PM ","Sylhet International Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.sylhet,R.drawable.khulna,"Play No :08","Sylhet Sixers Vs Khulna Titans","8January,2019","Time : 7.00PM ","Sylhet International Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.ranglur,R.drawable.rajshahi,"Play No :09","Rangpur Riders Vs Rajshahi Kings","11January,2019","Time : 2.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.dhaka,R.drawable.sylhet,"Play No :10","Dhaka Dynamites Vs Sylhet Sixers","11January,2019","Time : 7.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.chittagang,R.drawable.khulna,"Play No :11","Chittagong Vikings Vs Khulna Titans","12January,2019","Time : 2.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.rajshahi,R.drawable.comilla,"Play No :12","Rajshahi Kings Vs Comilla Victorians","12January,2019","Time : 7.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.dhaka,R.drawable.khulna,"Play No :13","Dhaka Dynamites Vs Khulna Titans","14January,2019","Time : 2.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.comilla,R.drawable.chittagang,"Play No :14","Comilla Victorians Vs Chittagong Vikings","14January,2019","Time : 7.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.khulna,R.drawable.sylhet,"Play No :15","Khulna Titans Vs Sylhet Sixers","15January,2019","Time : 2.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.dhaka,R.drawable.chittagang,"Play No :16","Dhaka Dynamites Vs Chittagong Vikings","15January,2019","Time : 7.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.rajshahi,R.drawable.sylhet,"Play No :17","Rajshahi Kings Vs Sylhet Sixers","17January,2019","Time : 2.30PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.khulna,R.drawable.chittagang,"Play No :18","Khulna Titans Vs Chittagong Vikings","17January,2019","Time : 7.15PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.dhaka,R.drawable.rajshahi,"Play No :19","Dhaka Dynamites Vs Rajshahi Kings","18January,2019","Time : 2.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.ranglur,R.drawable.comilla,"Play No :20","Rangpur Riders Vs Comilla Victorians","18January,2019","Time : 7.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.comilla,R.drawable.dhaka,"Play No :21","Comilla Victorians Vs Dhaka Dynamites","20January,2019","Time : 2.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.sylhet,R.drawable.ranglur,"Play No :22","Sylhet Sixers Vs Rangpur Riders","20January,2019","Time : 7.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.rajshahi,R.drawable.khulna,"Play No :23","Rajshahi Kings Vs Khulna Titans","21January,2019","Time : 2.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.ranglur,R.drawable.dhaka,"Play No :24","Rangpur Riders Vs Dhaka Dynamites","21January,2019","Time : 7.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.khulna,R.drawable.ranglur,"Play No :25","Khulna Titans Vs Rangpur Riders","24January,2019","Time : 2.30PM ","Zohur Ahmed Chowdhury Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.chittagang,R.drawable.sylhet,"Play No :26","Chittagong Vikings Vs Sylhet Sixers","24January,2019","Time : 7.15PM ","Zohur Ahmed Chowdhury Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.comilla,R.drawable.rajshahi,"Play No :27","Comilla Victorians Vs Rajshahi Kings","25January,2019","Time : 2.00PM ","Zohur Ahmed Chowdhury Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.chittagang,R.drawable.ranglur,"Play No :28","Chittagong Vikings Vs Rangpur Riders","25January,2019","Time : 7.00PM ","Zohur Ahmed Chowdhury Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.dhaka,R.drawable.chittagang,"Play No :29","Dhaka Dynamites Vs Chittagong Vikings","27January,2019","Time : 2.00PM ","Zohur Ahmed Chowdhury Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.khulna,R.drawable.rajshahi,"Play No :29","Khulna Titans Vs Rajshahi Kings","27January,2019","Time : 7.00PM ","Zohur Ahmed Chowdhury Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.ranglur,R.drawable.sylhet,"Play No :30","Rangpur Riders Vs Sylhet Sixers","28January,2019","Time : 2.00PM ","Zohur Ahmed Chowdhury Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.khulna,R.drawable.comilla,"Play No :31","Khulna Titans Vs Comilla Victorians","28January,2019","Time : 7.00PM ","Zohur Ahmed Chowdhury Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.chittagang,R.drawable.rajshahi,"Play No :32","Chittagong Vikings Vs Rajshahi Kings","29January,2019","Time : 2.00PM ","Zohur Ahmed Chowdhury Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.dhaka,R.drawable.comilla,"Play No :33","Dhaka Dynamites Vs Comilla Victorians","29January,2019","Time : 7.00PM ","Zohur Ahmed Chowdhury Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.comilla,R.drawable.ranglur,"Play No :34","Comilla Victorians Vs Rangpur Riders","2February,2019","Time : 2.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.dhaka,R.drawable.rajshahi,"Play No :35","Dhaka Dynamites Vs Rajshahi Kings","2February,2019","Time : 7.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.sylhet,R.drawable.chittagang,"Play No :36","Sylhet Sixers Vs Chittagong Vikings","3February,2019","Time : 2.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.ranglur,R.drawable.khulna,"Play No :37","Rangpur Riders Vs Khulna Titans","3February,2019","Time : 7.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.comilla,R.drawable.khulna,"Play No :38","Comilla Victorians Vs Khulna Titans","5February,2019","Time : 2.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.rajshahi,R.drawable.chittagang,"Play No :39","Rajshahi Kings Vs Chittagong Vikings","5February,2019","Time : 7.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.dhaka,R.drawable.ranglur,"Play No :40","Dhaka Dynamites Vs Rangpur Riders","6February,2019","Time : 2.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.drawable.comilla,R.drawable.sylhet,"Play No :41","Comilla Victorians Vs Sylhet Sixers","6February,2019","Time : 7.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :42","3rd Place Vs 4th Place","8February,2019","Time : 2.30PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :43","1rd Place Vs 2th Place","8February,2019","Time : 7.15PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :44","Play 42 winner Vs Play 43 Loser","10February,2019","Time : 7.00PM ","Sher-e-Bangla National Cricket Stadium"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"Play No :45","Play 44 winner Vs Play 43 winner","12February,2019","Time : 7.00PM ","Sher-e-Bangla National Cricket Stadium"));

    }

}
