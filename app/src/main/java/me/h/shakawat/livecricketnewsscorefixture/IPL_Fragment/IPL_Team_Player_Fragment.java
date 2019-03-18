package me.h.shakawat.livecricketnewsscorefixture.IPL_Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import me.h.shakawat.livecricketnewsscorefixture.Adapter.CustomAdapter;
import me.h.shakawat.livecricketnewsscorefixture.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class IPL_Team_Player_Fragment extends Fragment {


    private ExpandableListView expandableListView;
    private int lastExpandedPosition = -1;

    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;


    public IPL_Team_Player_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_ipl__team__player_, container, false);


        prepareData();

        expandableListView = view.findViewById(R.id.expandableListViewId);
        CustomAdapter customAdapter = new CustomAdapter(getContext(),listDataHeader,listDataChild);
        expandableListView.setAdapter(customAdapter);

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                String childName = listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition);
                Toast.makeText(getActivity(),"Clicked "+childName,Toast.LENGTH_SHORT).show();

                return false;
            }
        });


        //////this for last expanded positions......
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                if (lastExpandedPosition != -1 && lastExpandedPosition != groupPosition){
                    expandableListView.collapseGroup(lastExpandedPosition);
                }
                lastExpandedPosition = groupPosition;
            }
        });

        return view;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public void prepareData(){

        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();


        listDataHeader.add("Chennai Super Kings");
        listDataHeader.add("Delhi Daredevils");
        listDataHeader.add("Kings XI Punjab");
        listDataHeader.add("Kolkata Knight Riders");
        listDataHeader.add("Mumbai Indians");
        listDataHeader.add("Rajasthan Royals");
        listDataHeader.add("Royal Challengers Bangalore");
        listDataHeader.add("Sunrisers Hyderabad");



        List<String> one = new ArrayList<>();
        one.add("Brad Hodge(Coach)");
        one.add("Ravichandran Ashwin(Captain)");

        List<String> two = new ArrayList<>();
        two.add("Gary Kirsten(Coach)");
        two.add("Virat Kohli(Captain)");

        List<String> three = new ArrayList<>();
        three.add("Jacques Kallis(Coach)");
        three.add("Dinesh Karthik(Captain)");

        List<String> four = new ArrayList<>();
        four.add("Mahela Jayawardene(Coach)");
        four.add("Rohit Sharma(Captain)");

        List<String> five = new ArrayList<>();
        five.add("Paddy Upton(Coach)");
        five.add("Ajinkya Rahane(Captain)");

        List<String> six = new ArrayList<>();
        six.add("Ricky Ponting(Coach)");
        six.add("Shreyas Iyer(Captain)");

        List<String> seven = new ArrayList<>();
        seven.add("Stephen Fleming(Coach)");
        seven.add("MS Dhoni(Captain)");

        List<String> eight = new ArrayList<>();
        eight.add("Tom Moody(Coach)");
        eight.add("Kane Williamson(Captain)");



        listDataChild.put(listDataHeader.get(0),one);
        listDataChild.put(listDataHeader.get(1),two);
        listDataChild.put(listDataHeader.get(2),three);
        listDataChild.put(listDataHeader.get(3),four);
        listDataChild.put(listDataHeader.get(4),five);
        listDataChild.put(listDataHeader.get(5),six);
        listDataChild.put(listDataHeader.get(6),seven);
        listDataChild.put(listDataHeader.get(7),eight);

    }


}
