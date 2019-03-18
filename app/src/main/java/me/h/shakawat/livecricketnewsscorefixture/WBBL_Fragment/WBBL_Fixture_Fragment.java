package me.h.shakawat.livecricketnewsscorefixture.WBBL_Fragment;


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
public class WBBL_Fixture_Fragment extends Fragment {


    private View view;
    private RecyclerView mRecyclerView;
    private List<WorldCup> lstWorldCup;

    public WBBL_Fixture_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_wbbl__fixture_, container, false);
        mRecyclerView = view.findViewById(R.id.wbbl_fixture_RecyclerViewId);

        WorldCupRecyclerView worldCupRecyclerView = new WorldCupRecyclerView(getContext(),lstWorldCup);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(worldCupRecyclerView);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstWorldCup = new ArrayList<>();
        lstWorldCup.add(new WorldCup(R.drawable.perth_scorchers,R.drawable.hobart_hurricanes,"Play No :01",
                "Perth Scorchers Vs Hobart Hurricanes","SAT 1 December 2018","Time : 05:40 AM +06 ","CitiPower Centre, St Kilda"));
        lstWorldCup.add(new WorldCup(R.drawable.melborn_stars,R.drawable.sydney_sixers,"Play No :02",
                "Melbourne Stars Vs Sydney Sixers","SAT 1 December 2018","Time : 08:50 AM +06 ","CitiPower Centre, St Kilda"));
        lstWorldCup.add(new WorldCup(R.drawable.adelaide_strikers,R.drawable.brisbane_heat,"Play No :03",
                "Adelaide Strikers Vs Brisbane Heat","SUN 2 December 2018","Time : 05:40 AM +06 ","CitiPower Centre, St Kilda"));
        lstWorldCup.add(new WorldCup(R.drawable.mebourne_rengades,R.drawable.sydney_thunder,"Play No :04",
                "Melbourne Renegades Vs Sydney Thunder","SUN 2 December 2018","Time : 08:50 AM +06 ","CitiPower Centre, St Kilda"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_sixers,R.drawable.perth_scorchers,"Play No :05",
                "Sydney Sixers(H) Vs Perth Scorchers","FRI 7 December 2018","Time : 05:10 PM +06 ","North Sydney Oval No.1"));
        lstWorldCup.add(new WorldCup(R.drawable.hobart_hurricanes,R.drawable.melborn_stars,"Play No :06",
                "Hobart Hurricanes Vs Melbourne Stars","SAT 8 December 2018","Time : 09:00 AM +06 ","West Park Oval, Burnie"));
        lstWorldCup.add(new WorldCup(R.drawable.mebourne_rengades,R.drawable.adelaide_strikers,"Play No :07",
                "Melbourne Renegades Vs Adelaide Strikers","SAT 8 December 2018","Time : 09:10 AM +06 ","CitiPower Centre, St Kilda"));
        lstWorldCup.add(new WorldCup(R.drawable.brisbane_heat,R.drawable.perth_scorchers,"Play No :08",
                "Brisbane Heat Vs Perth Scorchers","SAT 8 December 2018","Time : 09:50 AM +06 ","North Sydney Oval No.1"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_sixers,R.drawable.sydney_thunder,"Play No :09",
                "Sydney Sixers Vs Sydney Thunder","SAT 8 December 2018","Time : 02:10 PM +06 ","North Sydney Oval No.1"));
        lstWorldCup.add(new WorldCup(R.drawable.melborn_stars,R.drawable.hobart_hurricanes,"Play No :10",
                "Melbourne Stars Vs Hobart Hurricanes","SUN 9 December 2018","Time : 05:30 AM +06 ","West Park Oval, Burnie"));
        lstWorldCup.add(new WorldCup(R.drawable.adelaide_strikers,R.drawable.mebourne_rengades,"Play No :11",
                "Adelaide Strikers Vs Melbourne Renegades","SUN 9 December 2018","Time : 06:00 AM +06 ","TBC"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_thunder,R.drawable.brisbane_heat,"Play No :12",
                "Sydney Thunder Vs Brisbane Heat","SUN 9 December 2018","Time : 09:50 AM +06 ","North Sydney Oval No.1"));
        lstWorldCup.add(new WorldCup(R.drawable.melborn_stars,R.drawable.perth_scorchers,"Play No :13",
                "Melbourne Stars Vs Perth Scorchers","SAT 15 December 2018","Time : 05:00 AM +06 ","Casey Fields, Cranbourne, Melbourne"));
        lstWorldCup.add(new WorldCup(R.drawable.adelaide_strikers,R.drawable.sydney_thunder,"Play No :14",
                "Adelaide Strikers Vs Sydney Thunder","SAT 15 December 2018","Time : 09:50 AM +06 ","Blundstone Arena, Hobart"));
        lstWorldCup.add(new WorldCup(R.drawable.hobart_hurricanes,R.drawable.sydney_sixers,"Play No :15",
                "Hobart Hurricanes Vs Sydney Sixers","SAT 15 December 2018","Time : 02:00 PM +06 ","Blundstone Arena, Hobart"));
        lstWorldCup.add(new WorldCup(R.drawable.perth_scorchers,R.drawable.melborn_stars,"Play No :16",
                "Perth Scorchers Vs Melbourne Stars","SUN 16 December 2018","Time : 05:00 AM +06 ","Casey Fields, Cranbourne, Melbourne"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_thunder,R.drawable.adelaide_strikers,"Play No :17",
                "Sydney Thunder Vs Adelaide Strikers","SUN 16 December 2018","Time : 05:00 AM +06 ","Blundstone Arena, Hobart"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_sixers,R.drawable.hobart_hurricanes,"Play No :18",
                "Sydney Sixers Vs Hobart Hurricanes","SUN 16 December 2018","Time : 08:50 AM +06 ","Blundstone Arena, Hobart"));
        lstWorldCup.add(new WorldCup(R.drawable.mebourne_rengades,R.drawable.brisbane_heat,"Play No :19",
                "Melbourne Renegades Vs Brisbane Heat","SUN 16 December 2018","Time : 06:00 AM +06 ","TBC"));
        lstWorldCup.add(new WorldCup(R.drawable.hobart_hurricanes,R.drawable.perth_scorchers,"Play No :20",
                "Hobart Hurricanes Vs Perth Scorchers","TUE 18 December 2018","Time : 07:00 AM +06 ","Blundstone Arena, Hobart"));
        lstWorldCup.add(new WorldCup(R.drawable.brisbane_heat,R.drawable.melborn_stars,"Play No :21",
                "Brisbane Heat Vs Melbourne Stars","WED 19 December 2018","Time : 09:50 AM +06 ","The Gabba, Brisbane"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_thunder,R.drawable.hobart_hurricanes,"Play No :22",
                "Sydney Thunder Vs Hobart Hurricanes","FRI 21 December 2018","Time : 06:00 AM +06 ","The Gabba, Brisbane"));
        lstWorldCup.add(new WorldCup(R.drawable.melborn_stars,R.drawable.adelaide_strikers,"Play No :23",
                "Melbourne Stars Vs Adelaide Strikers","FRI 21 December 2018","Time : 06:00 PM +06 ",""));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_sixers,R.drawable.brisbane_heat,"Play No :24",
                "Sydney Sixers Vs Brisbane Heat","SAT 22 December 2018","Time :  06:10 PM +06 ","Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.perth_scorchers,R.drawable.mebourne_rengades,"Play No :25",
                "Perth Scorchers Vs Melbourne Renegades","SAT 22 December 2018","Time : 02:30 PM +06 ","Perth"));
        lstWorldCup.add(new WorldCup(R.drawable.adelaide_strikers,R.drawable.melborn_stars,"Play No :26",
                "Adelaide Strikers Vs Melbourne Stars","SUN 23 December 2018","Time : 08:50 AM +06 ","Adelaide"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_sixers,R.drawable.brisbane_heat,"Play No :27",
                "Sydney Sixers Vs Brisbane Heat","SUN 23 December 2018","Time : 09:10 AM +06 ","Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.perth_scorchers,R.drawable.mebourne_rengades,"Play No :28",
                "Perth Scorchers Vs Melbourne Renegades","SUN 23 December 2018","Time : 12:00 PM +06 ","Perth"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_thunder,R.drawable.hobart_hurricanes,"Play No :29",
                "Sydney Thunder Vs Hobart Hurricanes","MON 24 December 2018","Time : 09:50 AM +06 ","Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.perth_scorchers,R.drawable.brisbane_heat,"Play No :30",
                "Perth Scorchers Vs Brisbane Heat","WED 26 December 2018","Time : 05:45 PM +06 ","Melbourne"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_sixers,R.drawable.mebourne_rengades,"Play No :31",
                "Sydney Sixers Vs Melbourne Renegades","THU 27 December 2018","Time : 09:50 AM +06 ","Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_sixers,R.drawable.adelaide_strikers,"Play No :32",
                "Sydney Sixers Vs Adelaide Strikers","FRI 28 December 2018","Time : 09:10 AM +06 ","Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.perth_scorchers,R.drawable.sydney_thunder,"Play No :33",
                "Perth Scorchers Vs Sydney Thunder","SAT 29 December 2018","Time : 08:00 AM +06 ","Perth"));

        lstWorldCup.add(new WorldCup(R.drawable.hobart_hurricanes,R.drawable.brisbane_heat,"Play No :34",
                "Hobart Hurricanes Vs Brisbane Heat","SAT 29 December 2018","Time : 09:10 AM +06 ","Launceston"));
        lstWorldCup.add(new WorldCup(R.drawable.mebourne_rengades,R.drawable.melborn_stars,"Play No :35",
                "Melbourne Renegades Vs Melbourne Stars","SAT 29 December 2018","Time : 09:50 AM +06 ","Melbourne"));
        lstWorldCup.add(new WorldCup(R.drawable.perth_scorchers,R.drawable.sydney_thunder,"Play No :36",
                "Perth Scorchers Vs Sydney Thunder","SUN 30 December 2018","Time : 08:00 AM +06 ","Perth"));
        lstWorldCup.add(new WorldCup(R.drawable.hobart_hurricanes,R.drawable.brisbane_heat,"Play No :37",
                "Hobart Hurricanes Vs Brisbane Heat","SUN 30 December 2018","Time : 08:50 AM +06 ","Launceston"));
        lstWorldCup.add(new WorldCup(R.drawable.adelaide_strikers,R.drawable.sydney_sixers,"Play No :38",
                "Adelaide Strikers Vs Sydney Sixers","MON 31 December 2018","Time : 08:50 AM +06 ","Adelaide"));
        lstWorldCup.add(new WorldCup(R.drawable.melborn_stars,R.drawable.mebourne_rengades,"Play No :39",
                "Melbourne Stars Vs Melbourne Renegades","TUE 1 January 2019","Time : 09:50 AM +06 ","Melbourne"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_thunder,R.drawable.sydney_sixers,"Play No :40",
                "Sydney Thunder Vs Sydney Sixers","WED 2 January 2019","Time : 09:50 AM +06 ","Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.mebourne_rengades,R.drawable.hobart_hurricanes,"Play No :41",
                "Melbourne Renegades Vs Hobart Hurricanes","THU 3 January 2019","Time : 06:00 AM +06 ",""));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_thunder,R.drawable.melborn_stars,"Play No :42",
                "Sydney Thunder Vs Melbourne Stars","SAT 5 January 2019","Time : 09:00 AM +06 ","Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.brisbane_heat,R.drawable.adelaide_strikers,"Play No :43",
                "Brisbane Heat Vs Adelaide Strikers","SAT 5 January 2019","Time : 02:15 PM +06 ","Mackay"));
        lstWorldCup.add(new WorldCup(R.drawable.perth_scorchers,R.drawable.sydney_sixers,"Play No :44",
                "Perth Scorchers Vs Sydney Sixers","SUN 6 January 2019","Time : 08:00 AM +06 ","Perth"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_thunder,R.drawable.melborn_stars,"Play No :45",
                "Sydney Thunder Vs Melbourne Stars","SUN 6 January 2019","Time : 09:00 AM +06 ","Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.brisbane_heat,R.drawable.mebourne_rengades,"Play No :46",
                "Brisbane Heat Vs Melbourne Renegades","SUN 6 January 2019","Time : 11:00 AM +06 ","Mackay"));
        lstWorldCup.add(new WorldCup(R.drawable.sydney_thunder,R.drawable.mebourne_rengades,"Play No :47",
                "Sydney Thunder Vs Melbourne Renegades","TUE 8 January 2019","Time : 08:50 AM +06 ","Sydney"));
        lstWorldCup.add(new WorldCup(R.drawable.adelaide_strikers,R.drawable.hobart_hurricanes,"Play No :48",
                "Adelaide Strikers Vs Hobart Hurricanes","TUE 8 January 2019","Time : 09:10 AM +06 ","Adelaide"));
        lstWorldCup.add(new WorldCup(R.drawable.adelaide_strikers,R.drawable.hobart_hurricanes,"Play No :49",
                "Adelaide Strikers Vs Hobart Hurricanes","WED 9 January 2019","Time : 09:10 AM +06 ","Adelaide"));
        lstWorldCup.add(new WorldCup(R.drawable.melborn_stars,R.drawable.brisbane_heat,"Play No :50",
                "Melbourne Stars Vs Brisbane Heat","THU 10 January 2019","Time : 08:50 AM +06 ","Brisbane"));
        lstWorldCup.add(new WorldCup(R.drawable.adelaide_strikers,R.drawable.perth_scorchers,"Play No :51",
                "Adelaide Strikers Vs Perth Scorchers","SAT 12 January 2019","Time : 07:20 AM +06 ","Alice Springs"));
        lstWorldCup.add(new WorldCup(R.drawable.mebourne_rengades,R.drawable.hobart_hurricanes,"Play No :52",
                "Melbourne Renegades Vs Hobart Hurricanes","SAT 12 January 2019","Time : 08:00 AM +06 ","Melbourne"));
        lstWorldCup.add(new WorldCup(R.drawable.brisbane_heat,R.drawable.sydney_thunder,"Play No :53",
                "Brisbane Heat Vs Sydney Thunder","SAT 12 January 2019","Time : 02:15 PM +06 ","Cairns"));
        lstWorldCup.add(new WorldCup(R.drawable.perth_scorchers,R.drawable.adelaide_strikers,"Play No :54",
                "Perth Scorchers Vs Adelaide Strikers","SUN 13 January 2019","Time : 07:20 AM +06 ","Alice Springs"));
        lstWorldCup.add(new WorldCup(R.drawable.mebourne_rengades,R.drawable.sydney_sixers,"Play No :55",
                "Melbourne Renegades Vs Sydney Sixers","SUN 13 January 2019","Time : 06:00 AM +06 ",".."));
        lstWorldCup.add(new WorldCup(R.drawable.melborn_stars,R.drawable.sydney_sixers,"Play No :56",
                "Melbourne Stars Vs Sydney Sixers","MON 14 January 2019","Time : 09:50 AM +06 ","Melbourne"));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"1st Semi-Final",
                "TBA Vs TBA","SAT 19 January 2019","Time : 06:00 AM +06 ",".."));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"2nd Semi-Final",
                "TBA Vs TBA","SAT 19 January 2019","Time : 06:00 AM +06 ",".."));
        lstWorldCup.add(new WorldCup(R.mipmap.ic_launcher,R.mipmap.ic_launcher,"WBBL Final",
                "TBA Vs TBA","SAT 26 January 2019","Time : 06:00 AM +06 ",".."));

    }

}
