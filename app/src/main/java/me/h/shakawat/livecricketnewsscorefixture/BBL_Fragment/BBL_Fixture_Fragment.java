package me.h.shakawat.livecricketnewsscorefixture.BBL_Fragment;


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
public class BBL_Fixture_Fragment extends Fragment {


    private View view;
    private RecyclerView mRecyclerView;
    private List<WorldCup> lstWorldCup;


    public BBL_Fixture_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_bbl__fixture_, container, false);
        mRecyclerView = view.findViewById(R.id.bbl_fixture_RecyclerViewId);

        WorldCupRecyclerView worldCupRecyclerView = new WorldCupRecyclerView(getContext(),lstWorldCup);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(worldCupRecyclerView);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstWorldCup = new ArrayList<>();
        lstWorldCup.add(new WorldCup(R.drawable.brisbane_heat,R.drawable.adelaide_strikers,"Play No :01",
                "Brisbane Heat Vs Adelaide Strikers","WED 19 December 2018","Time : 02:15 PM +06 ","The Gabba, Brisbane"));
        lstWorldCup.add(new WorldCup(R.drawable.mebourne_rengades,R.drawable.perth_scorchers,"Play No :02",
                "Melbourne Renegades Vs Perth Scorchers","THU 20 December 2018","Time : 02:15 PM +06 ","Marvel Stadium, Melbourne"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_thunder,R.drawable.melborn_stars,"Play No :03",
                "Sydney Thunder Vs Melbourne Stars","FRI 21 December 2018","Time : 02:15 PM +06 ","Manuka Oval, Canberra"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_sixers,R.drawable.perth_scorchers,"Play No :04",
                "Sydney Sixers Vs Perth Scorchers","SAT 22 December 2018","Time : 10:30 AM +06 ","Sydney Cricket Ground, Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.brisbane_heat,R.drawable.hobart_hurricanes,"Play No :05",
                "Brisbane Heat Vs Hobart Hurricanes","SAT 22 December 2018","Time : 01:00 PM +06 ","Metricon Stadium, Gold Coast"));
        lstWorldCup.add(new WorldCup(R.drawable.brisbane_heat,R.drawable.hobart_hurricanes,"Play No :06",
                "Brisbane Heat Vs Hobart Hurricanes","SUN 23 December 2018","Time : 02:15 PM +06 ","Adelaide Oval, Adelaide"));
        lstWorldCup.add(new WorldCup(R.drawable.hobart_hurricanes,R.drawable.melborn_stars,"Play No :07",
                "Hobart Hurricanes Vs Melbourne Stars","MON 24 December 2018","Time : 10:45 AM +06 ","Blundstone Arena, Hobart"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_thunder,R.drawable.sydney_sixers,"Play No :08",
                "Sydney Thunder Vs Sydney Sixers","MON 24 December 2018","Time : 02:15 PM +06 ","Spotless Stadium, Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.perth_scorchers,R.drawable.adelaide_strikers,"Play No :09",
                "Perth Scorchers Vs Adelaide Strikers","WED 26 December 2018","Time : 02:15 PM +06 ","Optus Stadium, Perth"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_sixers,R.drawable.melborn_stars,"Play No :10",
                "Sydney Sixers Vs Melbourne Stars","THU 27 December 2018","Time : 02:15 PM +06 ","Sydney Cricket Ground, Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.hobart_hurricanes,R.drawable.sydney_thunder,"Play No :11",
                "Hobart Hurricanes Vs Sydney Thunder","FRI 28 December 2018","Time : 02:15 PM +06 ","Blundstone Arena, Hobart"));
        lstWorldCup.add(new WorldCup(R.drawable.mebourne_rengades,R.drawable.sydney_sixers,"Play No :12",
                "Melbourne Renegades Vs Sydney Sixers","SAT 29 December 2018","Time : 02:00 PM +06 ","Marvel Stadium, Melbourne"));
        lstWorldCup.add(new WorldCup(R.drawable.hobart_hurricanes,R.drawable.perth_scorchers,"Play No :13",
                "Hobart Hurricanes Vs Perth Scorchers","SUN 30 December 2018","Time : 02:15 PM +06 ","University of Tasmania Stadium, Launceston"));
        lstWorldCup.add(new WorldCup(R.drawable.adelaide_strikers,R.drawable.sydney_thunder,"Play No :14",
                "Adelaide Strikers Vs Sydney Thunder","MON 31 December 2018","Time : 02:15 PM +06 ","Adelaide Oval, Adelaide"));
        lstWorldCup.add(new WorldCup(R.drawable.brisbane_heat,R.drawable.sydney_sixers,"Play No :15",
                "Brisbane Heat Vs Sydney Sixers","TUE 1 January 2019","Time : 09:45 AM +06 ","Metricon Stadium, Gold Coast"));
        lstWorldCup.add(new WorldCup(R.drawable.mebourne_rengades,R.drawable.melborn_stars,"Play No :16",
                "Melbourne Renegades Vs Melbourne Stars","TUE 1 January 2019","Time : 02:15 PM +06 ","Melbourne Cricket Ground, Melbourne"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_thunder,R.drawable.perth_scorchers,"Play No :17",
                "Sydney Thunder Vs Perth Scorchers","WED 2 January 2019","Time : 02:15 PM +06 ","Spotless Stadium, Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.mebourne_rengades,R.drawable.adelaide_strikers,"Play No :18",
                "Melbourne Renegades Vs Adelaide Strikers","THU 3 January 2019","Time : 02:15 PM +06 ","GMHBA Stadium, Geelong"));
        lstWorldCup.add(new WorldCup(R.drawable.hobart_hurricanes,R.drawable.sydney_sixers,"Play No :19",
                "Hobart Hurricanes Vs Sydney Sixers","FRI 4 January 2019","Time : 02:15 PM +06 ","Blundstone Arena, Hobart"));
        lstWorldCup.add(new WorldCup(R.drawable.melborn_stars,R.drawable.sydney_thunder,"Play No :20",
                "Melbourne Stars Vs Sydney Thunder","SAT 5 January 2019","Time : 01:15 PM +06 ","Metricon Stadium, Gold Coast"));
        lstWorldCup.add(new WorldCup(R.drawable.perth_scorchers,R.drawable.brisbane_heat,"Play No :21",
                "Perth Scorchers Vs Brisbane Heat","SAT 5 January 2019","Time : 04:30 PM +06 ","Optus Stadium, Perth"));
        lstWorldCup.add(new WorldCup(R.drawable.adelaide_strikers,R.drawable.sydney_sixers,"Play No :22",
                "Adelaide Strikers Vs Sydney Sixers","SUN 6 January 2019","Time : 02:15 PM +06 ","Adelaide Oval, Adelaide"));
        lstWorldCup.add(new WorldCup(R.drawable.mebourne_rengades,R.drawable.hobart_hurricanes,"Play No :23",
                "Melbourne Renegades Vs Hobart Hurricanes","MON 7 January 2019","Time : 02:15 PM +06 ","Marvel Stadium, Melbourne"));
        lstWorldCup.add(new WorldCup(R.drawable.brisbane_heat,R.drawable.sydney_thunder,"Play No :24",
                "Brisbane Heat Vs Sydney Thunder","TUE 8 January 2019","Time : 02:15 PM +06 ","Spotless Stadium, Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.melborn_stars,R.drawable.perth_scorchers,"Play No :25",
                "Melbourne Stars Vs Perth Scorchers","WED 9 January 2019","Time : 02:15 PM +06 ","Melbourne Cricket Ground, Melbourne"));
        lstWorldCup.add(new WorldCup(R.drawable.brisbane_heat,R.drawable.mebourne_rengades,"Play No :26",
                "Brisbane Heat Vs Melbourne Renegades","THU 10 January 2019","Time : 02:15 PM +06 ","The Gabba, Brisbane"));
        lstWorldCup.add(new WorldCup(R.drawable.adelaide_strikers,R.drawable.melborn_stars,"Play No :27",
                "Adelaide Strikers Vs Melbourne Stars","FRI 11 January 2019","Time : 02:00 PM +06 ","Adelaide Oval, Adelaide"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_thunder,R.drawable.adelaide_strikers,"Play No :28",
                "Sydney Thunder Vs Adelaide Strikers","SUN 13 January 2019","Time : 09:45 AM +06 ","Spotless Stadium, Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.mebourne_rengades,R.drawable.brisbane_heat,"Play No :29",
                "Melbourne Renegades Vs Brisbane Heat","SUN 13 January 2019","Time : 01:35 PM +06 ","GMHBA Stadium, Geelong"));
        lstWorldCup.add(new WorldCup(R.drawable.perth_scorchers,R.drawable.sydney_sixers,"Play No :30",
                "Perth Scorchers Vs Sydney Sixers","SUN 13 January 2019","Time : 04:35 PM +06 ","Optus Stadium, Perth"));
        lstWorldCup.add(new WorldCup(R.drawable.melborn_stars,R.drawable.hobart_hurricanes,"Play No :31",
                "Melbourne Stars Vs Hobart Hurricanes","MON 14 January 2019","Time : 02:15 PM +06 ","Melbourne Cricket Ground, Melbourne"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_sixers,R.drawable.mebourne_rengades,"Play No :32",
                "Sydney Sixers Vs Melbourne Renegades","WED 16 January 2019","Time : 02:15 PM +06 ","Sydney Cricket Ground, Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.brisbane_heat,R.drawable.sydney_thunder,"Play No :33",
                "Brisbane Heat Vs Sydney Thunder","THU 17 January 2019","Time : 02:15 PM +06 ","The Gabba, Brisbane"));
        lstWorldCup.add(new WorldCup(R.drawable.perth_scorchers,R.drawable.hobart_hurricanes,"Play No :34",
                "Perth Scorchers Vs Hobart Hurricanes","FRI 18 January 2019","Time : 04:30 PM +06 ","Optus Stadium, Perth"));
        lstWorldCup.add(new WorldCup(R.drawable.mebourne_rengades,R.drawable.melborn_stars,"Play No :35",
                "Melbourne Renegades Vs Melbourne Star","SAT 19 January 2019","Time : 01:45 PM +06 ","Marvel Stadium, Melbourne"));
        lstWorldCup.add(new WorldCup(R.drawable.brisbane_heat,R.drawable.sydney_sixers,"Play No :36",
                "Brisbane Heat Vs Sydney Sixers","SUN 20 January 2019","Time : 02:15 PM +06 ","Sydney Cricket Ground, Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.adelaide_strikers,R.drawable.hobart_hurricanes,"Play No :37",
                "Adelaide Strikers Vs Hobart Hurricanes","MON 21 January 2019","Time : 02:15 PM +06 ","Adelaide Oval, Adelaide"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_thunder,R.drawable.mebourne_rengades,"Play No :38",
                "Sydney Thunder Vs Melbourne Renegades","TUE 22 January 2019","Time : 02:15 PM +06 ","Spotless Stadium, Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.melborn_stars,R.drawable.adelaide_strikers,"Play No :39",
                "Melbourne Star Vs Adelaide Strikers","WED 23 January 2019","Time : 09:45 AM +06 ","Ted Summerton Reserve, Moe"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_sixers,R.drawable.hobart_hurricanes,"Play No :40",
                "Sydney Sixers Vs Hobart Hurricanes","WED 23 January 2019","Time : 02:15 PM +06 ","Sydney Cricket Ground, Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.perth_scorchers,R.drawable.sydney_thunder,"Play No :41",
                "Perth Scorchers Vs Sydney Thunder","THU 24 January 2019","Time : 04:40 PM +06 ","Optus Stadium, Perth"));
        lstWorldCup.add(new WorldCup(R.drawable.melborn_stars,R.drawable.brisbane_heat,"Play No :42",
                "Melbourne Star Vs Brisbane Heat","SUN 27 January 2019","Time : 02:40 PM +06 ","Melbourne Cricket Ground, Melbourne"));
        lstWorldCup.add(new WorldCup(R.drawable.perth_scorchers,R.drawable.mebourne_rengades,"Play No :43",
                "Perth Scorchers Vs Melbourne Renegades","MON 28 January 2019","Time : 04:15 PM +06 ","Optus Stadium, Perth"));
        lstWorldCup.add(new WorldCup(R.drawable.brisbane_heat,R.drawable.hobart_hurricanes,"Play No :44",
                "Brisbane Heat Vs Hobart Hurricanes","TUE 29 January 2019","Time : 11:00 AM +06 ","Blundstone Arena, Hobart"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_sixers,R.drawable.adelaide_strikers,"Play No :45",
                "Sydney Sixers Vs Adelaide Strikers","TUE 29 January 2019","Time : 02:00 PM +06 ","Sydney Cricket Ground, Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_thunder,R.drawable.mebourne_rengades,"Play No :46",
                "Sydney Thunder Vs Melbourne Renegades","WED 30 January 2019","Time : 02:15 PM +06 ","Marvel Stadium, Melbourne"));
        lstWorldCup.add(new WorldCup(R.drawable.hobart_hurricanes,R.drawable.adelaide_strikers,"Play No :47",
                "Hobart Hurricanes Vs Adelaide Strikers","THU 31 January 2019","Time : 02:40 PM +06 ","University of Tasmania Stadium, Launceston"));
        lstWorldCup.add(new WorldCup(R.drawable.brisbane_heat,R.drawable.perth_scorchers,"Play No :48",
                "Brisbane Heat Vs Perth Scorchers","FRI 1 February 2019","Time : 03:40 PM +06 ","The Gabba, Brisbane"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_thunder,R.drawable.sydney_sixers,"Play No :49",
                "Sydney Thunder Vs Sydney Sixers","SAT 2 February 2019","Time : 02:00 PM +06 ","Sydney Cricket Ground, Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.adelaide_strikers,R.drawable.brisbane_heat,"Play No :50",
                "Adelaide Strikers Vs Brisbane Heat","SUN 3 February 2019","Time : 12:45 PM +06 ","Adelaide Oval, Adelaide"));
        lstWorldCup.add(new WorldCup(R.drawable.perth_scorchers,R.drawable.melborn_stars,"Play No :51",
                "Perth Scorchers Vs Melbourne Star","SUN 3 February 2019","Time : 04:15 PM +06 ","Optus Stadium, Perth"));
        lstWorldCup.add(new WorldCup(R.drawable.hobart_hurricanes,R.drawable.mebourne_rengades,"Play No :52",
                "Hobart Hurricanes Vs Melbourne Renegades","THU 7 February 2019","Time : 02:40 PM +06 ","Blundstone Arena, Hobart"));
        lstWorldCup.add(new WorldCup(R.drawable.brisbane_heat,R.drawable.melborn_stars,"Play No :53",
                "Brisbane Heat Vs Melbourne Star","FRI 8 February 2019","Time : 03:40 PM +06 ","The Gabba, Brisbane"));
        lstWorldCup.add(new WorldCup(R.drawable.adelaide_strikers,R.drawable.perth_scorchers,"Play No :54",
                "Adelaide Strikers Vs Perth Scorchers","SAT 9 February 2019","Time : 09:45 AM +06 ","Traeger Park, Alice Springs"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_thunder,R.drawable.hobart_hurricanes,"Play No :55",
                "Sydney Thunder Vs Hobart Hurricanes","SAT 9 February 2019","Time : 01:15 PM +06 ","Manuka Oval, Canberra"));
        lstWorldCup.add(new WorldCup(R.drawable.melborn_stars,R.drawable.sydney_sixers,"Play No :56",
                "Melbourne Star Vs Sydney Sixers","SUN 10 February 2019","Time : 09:45 AM +06 ","Melbourne Cricket Ground, Melbourne"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"1st Semi-Final",
                "TBD Vs TBD","THU 14 February 2019","Time : 02:40 PM +06 ","TBD"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"2nd Semi-Final",
                "TBD Vs TBD","FRI 15 February 2019","Time : 02:40 PM +06 ","TBD"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"BBL Final",
                "TBD Vs TBD","SUN 17 February 2019","Time : 02:40 PM +06 ","TBD"));

    }

}
