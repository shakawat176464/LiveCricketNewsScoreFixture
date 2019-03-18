package me.h.shakawat.livecricketnewsscorefixture.WBBL_Fragment;


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
public class WBBL_Team_Player_Fragment extends Fragment {


    private ExpandableListView expandableListView;
    private int lastExpandedPosition = -1;

    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;


    public WBBL_Team_Player_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_wbbl__team__player_, container, false);


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


        listDataHeader.add("Adelaide Strikers");
        listDataHeader.add("Brisbane Heat");
        listDataHeader.add("Hobart Hurricanes");
        listDataHeader.add("Melbourne Renegades");
        listDataHeader.add("Melbourne Stars");
        listDataHeader.add("Perth Scorchers");
        listDataHeader.add("Sydney Sixers");
        listDataHeader.add("Sydney Thunder");



        List<String> one = new ArrayList<>();
        one.add("Charlotte Edwards(Coach)");
        one.add("Tammy Beaumont");
        one.add("Bridget Patterson");
        one.add("Tabatha Saville");
        one.add("Suzie Bates");
        one.add("Kathryn Bryce");
        one.add("Sophie Devine");
        one.add("Rhiannon Dick");
        one.add("Tahlia McGrath");
        one.add("Tegan McPharlin");
        one.add("Annie O'Neil");
        one.add("Samantha Betts");
        one.add("Ellen Falconer");
        one.add("Katelyn Pope");
        one.add("Megan Schutt");
        one.add("Alex Price");
        one.add("Amanda-Jade Wellington");

        List<String> two = new ArrayList<>();
        two.add("Andy Richards(Coach)");
        two.add("Tess Cooper");
        two.add("Laura Harris");
        two.add("Smriti Mandhana");
        two.add("Kirby Short");
        two.add("Rumana Ahmed");
        two.add("Jemma Barsby");
        two.add("Haidee Birkett");
        two.add("Deandra Dottin");
        two.add("Grace Harris");
        two.add("Jess Jonassen");
        two.add("Delissa Kimmince");
        two.add("Beth Mooney");
        two.add("Holly Ferling");
        two.add("Courtney Hill");
        two.add("Sammy-Jo Johnson");
        two.add("Georgia Prestwidge");
        two.add("Kara Sutherland");

        List<String> three = new ArrayList<>();
        three.add("Julia Price(Coach)");
        three.add("Veda Krishnamurthy");
        three.add("Sasha Moloney");
        three.add("Emma Thompson");
        three.add("Stefanie Daffara");
        three.add("Erin Fazackerley");
        three.add("Nicola Hancock");
        three.add("Corinne Hall");
        three.add("Brooke Hepburn");
        three.add("Hayley Matthews");
        three.add("Meg Phillips");
        three.add("Veronica Pyke");
        three.add("Celeste Raack");
        three.add("Sarah Bryce");
        three.add("Georgia Redmayne");
        three.add("Lauren Winfield");
        three.add("Katelyn Fryett");

        List<String> four = new ArrayList<>();
        four.add("Lachlan Stevens(Coach)");
        four.add("Chamari Atapattu");
        four.add("Jess Duffin");
        four.add("Gaby Lewis");
        four.add("Rhiann O'Donnell");
        four.add("Amy Satterthwaite");
        four.add("Kris Britt");
        four.add("Maitlan Brown");
        four.add("Sophie Molineux");
        four.add("Molly Strano");
        four.add("Jenny Taffs");
        four.add("Tayla Vlaeminck");
        four.add("Georgia Wareham");
        four.add("Emma Inglis");
        four.add("Claire Koski");
        four.add("Hayley Jensen");
        four.add("Lea Tahuhu");

        List<String> five = new ArrayList<>();
        five.add("David Hemp(Coach)");
        five.add("Makinley Blows");
        five.add("Lizelle Lee");
        five.add("Mignon du Preez");
        five.add("Alana King");
        five.add("Anna Lanning");
        five.add("Katie Mack");
        five.add("Georgia Elwiss");
        five.add("Annabel Sutherland");
        five.add("Nicole Faltum");
        five.add("Hayleigh Brennan");
        five.add("Emma Kearney");
        five.add("Chloe Rafferty");
        five.add("Gemma Triscari");
        five.add("Kristen Beams");
        five.add("Erin Osborne");
        five.add("Khadija Tul Kubra");

        List<String> six = new ArrayList<>();
        six.add("Lisa Keightley(Coach)");
        six.add("Nicole Bolton");
        six.add("Lauren Ebsary");
        six.add("Heather Graham");
        six.add("Mikayla Hinkley");
        six.add("Meg Lanning");
        six.add("Chloe Piparo");
        six.add("Elyse Villani");
        six.add("Mathilda Carmichael");
        six.add("Thamsyn Newton");
        six.add("Ravina Oa");
        six.add("Natalie Sciver");
        six.add("Megan Banting");
        six.add("Emily Smith");
        six.add("Katherine Brunt");
        six.add("Piepa Cleary");
        six.add("Katie-Jane Hartshorn");
        six.add("Emma King");

        List<String> seven = new ArrayList<>();
        seven.add("Ben Sawyer(Coach)");
        seven.add("Ashleigh Gardner");
        seven.add("Erin Burns");
        seven.add("Kim Garth");
        seven.add("Jodie Hicks");
        seven.add("Clara Iemma");
        seven.add("Marizanne Kapp");
        seven.add("Carly Leeson");
        seven.add("Emily Leys");
        seven.add("Ellyse Perry");
        seven.add("Dane van Niekerk");
        seven.add("Alyssa Healy");
        seven.add("Sara McGlashan");
        seven.add("Sarah Aley");
        seven.add("Lauren Cheatle");
        seven.add("Lauren Smith");
        seven.add("Angela Reakes");


        List<String> eight = new ArrayList<>();
        eight.add("Joanne Broadbent(Coach)");
        eight.add("Alex Blackwell");
        eight.add("Nicola Carey");
        eight.add("Hannah Darlington");
        eight.add("Rachael Haynes");
        eight.add("Sterre Kalis");
        eight.add("Naomi Stalenberg");
        eight.add("Stafanie Taylor");
        eight.add("Harmanpreet Kaur");
        eight.add("Rachel Priest");
        eight.add("Hannah Trethewy");
        eight.add("Lisa Griffith");
        eight.add("Rene Farrell");
        eight.add("Belinda Vakarewa");
        eight.add("Samantha Bates");
        eight.add("Maisy Gibson");
        eight.add("Rachel Trenaman");



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
