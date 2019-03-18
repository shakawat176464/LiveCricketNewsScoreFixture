package me.h.shakawat.livecricketnewsscorefixture.BBL_Fragment;


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
public class BBL_Team_Player_Fragment extends Fragment {


    private ExpandableListView expandableListView;
    private int lastExpandedPosition = -1;

    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;


    public BBL_Team_Player_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_bbl__team__player_, container, false);


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
        one.add("Jason Gillespie(Coach)");
        one.add("Kelvin Smith");
        one.add("Jake Weatherald");
        one.add("Jonathan Wells");
        one.add("Jake Lehmann");
        one.add("Travis Head");
        one.add("Colin Ingram");
        one.add("Jono Dean");
        one.add("Matt Short");
        one.add("Michael Neser");
        one.add("Daniel Drew");
        one.add("Harry Nielsen");
        one.add("Alex Carey");
        one.add("Billy Stanlake");
        one.add("David Grant");
        one.add("Wes Agar");
        one.add("Nick Winter");
        one.add("Ben Laughlin");
        one.add("Peter Siddle");
        one.add("Liam O'Connor");
        one.add("Michael Cormack");
        one.add("Rashid Khan");

        List<String> two = new ArrayList<>();
        two.add("Daniel Vettori(Coach)");
        two.add("Max Bryant");
        two.add("Marnus Labuschagne");
        two.add("Joe Burns");
        two.add("Brendon McCullum");
        two.add("Sam Heazlett");
        two.add("Alex Ross");
        two.add("Chris Lynn");
        two.add("Matt Renshaw");
        two.add("Cameron Valente");
        two.add("Shadab Khan");
        two.add("Cameron Gannon");
        two.add("Ben Cutting");
        two.add("Jason Floros");
        two.add("Jimmy Peirson");
        two.add("Josh Lalor");
        two.add("Mark Steketee");
        two.add("James Pattinson");
        two.add("Brendan Doggett");
        two.add("Jack Prestwidge");
        two.add("Mitchell Swepson");
        two.add("Yasir Shah");
        two.add("Mujeeb Ur Rahman");
        two.add("Matthew Kuhnemann");

        List<String> three = new ArrayList<>();
        three.add("Adam Griffith(Coach)");
        three.add("George Bailey");
        three.add("Alex Doolan");
        three.add("Nathan Reardon");
        three.add("Caleb Jewell");
        three.add("James Faulkner");
        three.add("Clive Rose");
        three.add("Simon Milenko");
        three.add("D'Arcy Short");
        three.add("Hamish Kingston");
        three.add("James Bazley");
        three.add("Jofra Archer");
        three.add("Johan Botha");
        three.add("Tim Paine");
        three.add("Ben McDermott");
        three.add("Matthew Wade");
        three.add("Jake Doran");
        three.add("Tom Rogers");
        three.add("Riley Meredith");
        three.add("Aaron Summers");
        three.add("Sam Rainbird");
        three.add("Jake Reed");
        three.add("Tymal Mills");
        three.add("David Moody");

        List<String> four = new ArrayList<>();
        four.add("Andrew McDonald(Coach)");
        four.add("Aaron Finch");
        four.add("Tom Cooper");
        four.add("Cameron White");
        four.add("Marcus Harris");
        four.add("Beau Webster");
        four.add("Jack Wildermuth");
        four.add("Will Sutherland");
        four.add("Mohammad Nabi");
        four.add("Kieron Pollard");
        four.add("Mackenzie Harvey");
        four.add("Daniel Christian");
        four.add("Tim Ludeman");
        four.add("Chris Tremain");
        four.add("Kane Richardson");
        four.add("Joe Mennie");
        four.add("Zak Evans");
        four.add("Harry Gurney");
        four.add("Usman Khan Shinwari");
        four.add("Brad Hogg");
        four.add("Jon Holland");
        four.add("Cameron Boyce");

        List<String> five = new ArrayList<>();
        five.add("Stephen Fleming(Coach)");
        five.add("Nic Maddinson");
        five.add("Evan Gulbis");
        five.add("Glenn Maxwell");
        five.add("Marcus Stoinis");
        five.add("Travis Dean");
        five.add("Jonathan Merlo");
        five.add("Dwayne Bravo");
        five.add("Peter Handscomb");
        five.add("Seb Gotch");
        five.add("Ben Dunk");
        five.add("Scott Boland");
        five.add("Jackson Coleman");
        five.add("Daniel Worrall");
        five.add("Michael Beer");
        five.add("Adam Zampa");
        five.add("Sandeep Lamichhane");
        five.add("Matt Parkinson");
        five.add("Liam Bowe");

        List<String> six = new ArrayList<>();
        six.add("Adam Voges(Coach)");
        six.add("Cameron Bancroft");
        six.add("Will Bosisto");
        six.add("Tim David");
        six.add("Michael Klinger");
        six.add("Shaun Marsh");
        six.add("Ashton Agar");
        six.add("Hilton Cartwright");
        six.add("Mitchell Marsh");
        six.add("Ashton Turner");
        six.add("David Willey");
        six.add("Tim Bresnan");
        six.add("Usman Qadir");
        six.add("Josh Inglis");
        six.add("Josh Philippe");
        six.add("Sam Whiteman");
        six.add("Jason Behrendorff");
        six.add("Nathan Coulter-Nile");
        six.add("Joel Paris");
        six.add("Jhye Richardson");
        six.add("Andrew Tye");
        six.add("Cameron Green");
        six.add("Matthew Kelly");
        six.add("Haydan Morton");
        six.add("James Muirhead");

        List<String> seven = new ArrayList<>();
        seven.add("Greg Shipperd(Coach)");
        seven.add("Jordan Silk");
        seven.add("Daniel Hughes");
        seven.add("Jason Roy");
        seven.add("Joe Denly");
        seven.add("Nick Larkin");
        seven.add("Moises Henriques");
        seven.add("Ben Dwarshuis");
        seven.add("Carlos Brathwaite");
        seven.add("Jack Edwards");
        seven.add("John Hastings");
        seven.add("Sam Billings");
        seven.add("Peter Nevill");
        seven.add("Henry Thornton");
        seven.add("Jackson Bird");
        seven.add("Mitchell Starc");
        seven.add("Sean Abbott");
        seven.add("Mickey Edwards");
        seven.add("William Somerville");
        seven.add("Soumil Chhibber");
        seven.add("Nathan Lyon");
        seven.add("Steve O'Keefe");
        seven.add("Lloyd Pope");



        List<String> eight = new ArrayList<>();
        eight.add("Shane Bond(Coach)");
        eight.add("Callum Ferguson");
        eight.add("Ryan Gibson");
        eight.add("Usman Khawaja");
        eight.add("Kurtis Patterson");
        eight.add("Joe Root");
        eight.add("Anton Devcich");
        eight.add("Shane Watson");
        eight.add("Daniel Sams");
        eight.add("Nathan McAndrew");
        eight.add("Chris Jordan");
        eight.add("Jos Buttler");
        eight.add("Jay Lenton");
        eight.add("Pat Cummins");
        eight.add("Mitchell McClenaghan");
        eight.add("Clint McKay");
        eight.add("Andrew Fekete");
        eight.add("Gurinder Sandhu");
        eight.add("Fawad Ahmed");
        eight.add("Chris Green");
        eight.add("Arjun Nair");



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
