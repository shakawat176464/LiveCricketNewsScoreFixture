package me.h.shakawat.livecricketnewsscorefixture.T10_Fragment;


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
public class T10_TeamPlayer_Fragment extends Fragment {


    private ExpandableListView expandableListView;
    private int lastExpandedPosition = -1;

    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;


    public T10_TeamPlayer_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_t10__team_player_, container, false);


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


        listDataHeader.add("Kerala Kings");
        listDataHeader.add("Maratha Arabians");
        listDataHeader.add("Pakhtoons");
        listDataHeader.add("Punjabi Legends");
        listDataHeader.add("Karachians");
        listDataHeader.add("Bengal Tigers");
        listDataHeader.add("Northern Warriors");
        listDataHeader.add("Rajputs");///eight



        List<String> one = new ArrayList<>();///one
        one.add("Daniel Vettori(Coach)");
        one.add("Eoin Morgan (Icon Player, Captain)");
        one.add("Sohail Tanvir");
        one.add("Kieron Pollard");
        one.add("Paul Stirling");
        one.add("Dasun Shanaka");
        one.add("Chris Gayle");
        one.add("Junaid Khan");
        one.add("Sandeep Lamichhane");
        one.add("Tom Curran");
        one.add("Fabian Allen");
        one.add("Niroshan Dickwella");
        one.add("Imran Nazir");
        one.add("Benny Howell");
        one.add("Wayne Parnell");
        one.add("Reetinder Singh Sodhi");
        one.add("Mohammad Naveed");
        one.add("Abdul Shakoor");
        one.add("Upul Tharanga");

        List<String> two = new ArrayList<>();
        two.add("Wasim Akram(Coach)");
        two.add("Rashid Khan (Icon Player)");
        two.add("Kamran Akmal");
        two.add("Alex Hales");
        two.add("Dwayne Bravo");
        two.add("James Faulkner");
        two.add("Lasith Malinga");
        two.add("Liam Livingstone");
        two.add("James Vince");
        two.add("Brendan Taylor");
        two.add("Adam Lyth");
        two.add("Roelof van der Merwe");
        two.add("Najibullah Zadran");
        two.add("Richard Gleeson");
        two.add("Hazratullah Zazai");
        two.add("Zahoor Khan");
        two.add("Subramaniam Badrinath");
        two.add("Amir Hayat");

        List<String> three = new ArrayList<>();
        three.add("Dean Jones(Coach)");
        three.add("Shahid Afridi (Icon Player, Captain)");
        three.add("Mohammad Irfan");
        three.add("Liam Dawson");
        three.add("Colin Ingram");
        three.add("David Willey");
        three.add("Colin Munro");
        three.add("Andre Fletcher");
        three.add("Sohail Khan");
        three.add("Sharafuddin Ashraf");
        three.add("Chadwick Walton");
        three.add("Shapoor Zadran");
        three.add("Gulbadin Naib");
        three.add("Cameron Delport");
        three.add("R. P. Singh");
        three.add("Muhammad Kaleem");
        three.add("Sher Walli");

        List<String> four = new ArrayList<>();
        four.add("Mushtaq Ahmed(Coach)");
        four.add("Shoaib Malik (Icon Player, Captain)");
        four.add("Chris Jordan");
        four.add("Luke Ronchi");
        four.add("Liam Plunkett");
        four.add("Evin Lewis");
        four.add("Mohammad Sami");
        four.add("Zahir Khan");
        four.add("Umar Akmal");
        four.add("Mitchell McClenaghan");
        four.add("Tom Moores");
        four.add("Anwar Ali");
        four.add("Jade Dernbach");
        four.add("Hasan Khan");
        four.add("Praveen Kumar");
        four.add("Shaiman Anwar");
        four.add("Sandy Singh");

        List<String> five = new ArrayList<>();
        five.add("Tom Moody(Coach)");
        five.add("Shane Watson (Icon Player, Captain)");
        five.add("Anton Devcich");
        five.add("Ben Laughlin");
        five.add("Jofra Archer");
        five.add("Colin de Grandhomme");
        five.add("Ben Cutting");
        five.add("Mohammad Nawaz");
        five.add("Dawid Malan");
        five.add("Fawad Ahmed");
        five.add("Isuru Udana");
        five.add("Joe Clarke");
        five.add("Samiullah Shenwari");
        five.add("Mohammad Irfan");
        five.add("Denesh Ramdin");
        five.add("Ahmed Raza");
        five.add("Pravin Tambe");
        five.add("Ghulam Shabber");
        five.add("Thisara Perera");

        List<String> six = new ArrayList<>();
        six.add("Stephen Fleming(Coach)");
        six.add("Sunil Narine (Icon Player)");
        six.add("Sam Billings (Captain)");
        six.add("Tamim Iqbal");
        six.add("Jason Roy");
        six.add("Sarfraz Ahmed");
        six.add("Asif Ali");
        six.add("Mujeeb Ur Rahman");
        six.add("Morné Morkel");
        six.add("Aamer Yamin");
        six.add("Mohammad Nabi");
        six.add("Kusal Perera");
        six.add("Sherfane Rutherford");
        six.add("Kevon Cooper");
        six.add("Rayad Emrit");
        six.add("Ali Khan");
        six.add("Zaheer Khan");
        six.add("Chirag Suri");
        six.add("Muhammad Usman");
        six.add("Luke Wright");
        six.add("Riki Wessels");

        List<String> seven = new ArrayList<>();
        seven.add("Robin Singh(Coach)");
        seven.add("Darren Sammy(Icon Player,Captain)");
        seven.add("Wahab Riaz");
        seven.add("Nicolas Pooran");
        seven.add("Andre Russell");
        seven.add("Dwayne Smith");
        seven.add("Ravi Bopara");
        seven.add("Rovman Powell");
        seven.add("Harry Gurney");
        seven.add("Chris Green");
        seven.add("Obed McCoy");
        seven.add("Lendl Simmons");
        seven.add("Khary Pierre");
        seven.add("Kennar Lewis");
        seven.add("Imran Haider");
        seven.add("Amitoze Singh");
        seven.add("Rahul Bhatia");

        List<String> eight = new ArrayList<>();
        eight.add("Herschelle Gibbs(oach)");
        eight.add("Brendon McCullum (Icon Player)");
        eight.add("Chris Lynn");
        eight.add("Rilee Rossouw");
        eight.add("Mohammad Shahzad");
        eight.add("Mohammad Hafeez");
        eight.add("Tymal Mills");
        eight.add("Carlos Brathwaite");
        eight.add("Rahat Ali");
        eight.add("Samit Patel");
        eight.add("Qais Ahmad");
        eight.add("Ben Dunk");
        eight.add("Shan Masood");
        eight.add("Peter Trego");
        eight.add("Rohan Mustafa");
        eight.add("Munaf Patel");
        eight.add("Ashfaq Ahmed");
        eight.add("Mohammad Amir");
        eight.add("Laurie Evans");
        eight.add("Oshane Thomas");
        eight.add("Karim Janat");



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
