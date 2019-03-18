package me.h.shakawat.livecricketnewsscorefixture.BPL_Fragment;


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
public class BPL_Team_Player_Fragment extends Fragment {

    private ExpandableListView expandableListView;
    private int lastExpandedPosition = -1;

    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;

    public BPL_Team_Player_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_bpl__team__player_, container, false);


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


        listDataHeader.add("Rangpur Riders");
        listDataHeader.add("Khulna Titans");
        listDataHeader.add("Dhaka Dynamites");
        listDataHeader.add("Rajshahi Kings");
        listDataHeader.add("Sylhet Sixers");
        listDataHeader.add("Comilla Victorians");
        listDataHeader.add("Chittagong Vikings");



        List<String> one = new ArrayList<>();
        one.add("1. Mashrafe Mortaza");
        one.add("2. Nazmul Islam");
        one.add("3. Mohammad Mithun");
        one.add("4. Chris Gayle");
        one.add("5. Alex Hales");
        one.add("6. AB de Villiers");
        one.add("7. MD. Shafiul Islam");
        one.add("8. Shohag Gazi");
        one.add("9. Farhad Reza");
        one.add("10. Mehedi Maruf");
        one.add("11. Ravi Bopara (England)");
        one.add("12. Rilee Rossouw (South Africa)");
        one.add("13. Nahidul Islam");
        one.add("14. Nadif Chowdhury");
        one.add("15. Abul Hasan");
        one.add("16. Fardeen Hossain");
        one.add("17. Benny Howell (England)");
        one.add("18. Oshane Thomas (West Indies)");

        List<String> two = new ArrayList<>();
        two.add("1. Mahmudullah");
        two.add("2. Ariful Haque");
        two.add("3. Nazmul Hossain Shanto");
        two.add("4. Carlos Brathwaite");
        two.add("5. Dawid Malan");
        two.add("6. Ali Khan");
        two.add("7. Jahurul Islam");
        two.add("8. Shariful Islam");
        two.add("9. Taijul Islam");
        two.add("10. Al Amin");
        two.add("11. Zaheer Khan (Afghanistan)");
        two.add("12. Sherfane Rutherford (West Indies)");
        two.add("13. Subashish Roy");
        two.add("14. Junaid Siddique");
        two.add("15. Tanvir Islam");
        two.add("16. Mahidul Ankon");
        two.add("17. Lasith Malinga (Sri Lanka)");
        two.add("18. Yasir Shah (Pakistan)");
        two.add("19. Brendan Taylor (Zimbabwe)");

        List<String> three = new ArrayList<>();
        three.add("1. Shakib Al Hasan");
        three.add("2. Sunil Narine");
        three.add("3. Rovman Powell");
        three.add("4. Kieron Pollard");
        three.add("5. Andre Russell");
        three.add("6. Hazratullah Zazai");
        three.add("7. Rubel Hossain");
        three.add("8. Nurul Hasan Sohan");
        three.add("9. Rony Talukder");
        three.add("10. Shuvagata Hom");
        three.add("11. Andrew Birch (South Africa)");
        three.add("12. Ian Bell (England)");
        three.add("13. Qazi Onik");
        three.add("14. Mizanur Rahman");
        three.add("15. Asif Hasan");
        three.add("16. Shahadat Hossain");
        three.add("17. Naeem Sheikh");

        List<String> four = new ArrayList<>();
        four.add("1. Mustafizur Rahman");
        four.add("2. Mominul Haque");
        four.add("3. Mehidy Hasan Miraz");
        four.add("4. Zakir Hasan");
        four.add("5. Qais Ahmad");
        four.add("6. Christiaan Jonker");
        four.add("7. Soumya Sarker");
        four.add("8. Fazle Mahmud Rabbi");
        four.add("9. Arafat Sunny");
        four.add("10. Alauddin Babu");
        four.add("11. Isuru Udana (Sri Lanka)");
        four.add("12. Laurie Evans");
        four.add("13. Marshall Ayub");
        four.add("14. Kamrul Rabbi");
        four.add("15. Ryan ten Doeschate (Netherlands)");
        four.add("16. Seekkuge Prasanna (Sri Lanka)");
        four.add("17. Mohammad Sami (Pakistan)");

        List<String> five = new ArrayList<>();
        five.add("1. Nasir Hossain");
        five.add("2. Sabbir Rahman");
        five.add("3. Sohail Tanvir");
        five.add("4. Liton Das");
        five.add("5. Sandeep Lamichhane");
        five.add("6. David Warner");
        five.add("7. Afif Hossain");
        five.add("8. Taskin Ahmed");
        five.add("9. Al Amin Hossain");
        five.add("10. Towhid Hridoy");
        five.add("11. Fabian Allen (West Indies)");
        five.add("12. Mohammad Irfan (Pakistan)");
        five.add("13. Nabil Samad");
        five.add("14. Ebadat Hossain");
        five.add("15. Alok Kapali");
        five.add("16. Zakir Ali");
        five.add("17. Gulbadin Naib (Afghanistan)");
        five.add("18. Andre Fletcher (West Indies)");
        five.add("19. Mehedi Hasan Rana");
        five.add("20. Pat Brown (England)");
        five.add("21. Nicholas Pooran (West Indies)");

        List<String> six = new ArrayList<>();
        six.add("1. Tamim Iqbal");
        six.add("2. Imrul Kayes");
        six.add("3. Mohammad Saifuddin");
        six.add("4. Shoaib Malik");
        six.add("5. Asela Gunaratne");
        six.add("6. Liam Dawson");
        six.add("7. Abu Haider Rony");
        six.add("8. Anamul Haque Bijoy");
        six.add("9. Mehedi Hasan");
        six.add("10. Ziaur Rahman");
        six.add("11. Shahid Afridi (Pakistan)");
        six.add("12. Thisara Perera (Sri Lanka)");
        six.add("13. Mosharraf Hossain");
        six.add("14. Mohammad Shahid");
        six.add("15. Shamsur Rahman");
        six.add("16. Sanjit Saha");
        six.add("17. Evin Lewis (West Indies)");
        six.add("18. Waqar Salamkheil (Afghanistan)");
        six.add("19. Amin Yamin (Pakistan)");

        List<String> seven = new ArrayList<>();
        seven.add("1. Mushfiqur Rahim");
        seven.add("2. Sanjamul Islam");
        seven.add("3. Sikandar Raza");
        seven.add("4. Najibullah Zadran");
        seven.add("5. Luke Ronchi");
        seven.add("6. Mohammad Shahzad");
        seven.add("7. Robert Frylinck");
        seven.add("8. Mosaddek Hossain");
        seven.add("9. Abu Jayed Chowdhury Rahi");
        seven.add("10. Syed Khaled Ahmed");
        seven.add("11. Nayeem Hasan");
        seven.add("12. Cameron Delport (South Africa)");
        seven.add("13. Dasun Shanaka (Sri Lanka)");
        seven.add("14. Mohammad Ashraful");
        seven.add("15. Robiul Haque");
        seven.add("16. Yasir Ali Chowdhury");
        seven.add("17. Nihaduzzaman,");
        seven.add("18. Najibullah Zadran (Afghanistan)");
        seven.add("19. Shadman Islam");



        listDataChild.put(listDataHeader.get(0),one);
        listDataChild.put(listDataHeader.get(1),two);
        listDataChild.put(listDataHeader.get(2),three);
        listDataChild.put(listDataHeader.get(3),four);
        listDataChild.put(listDataHeader.get(4),five);
        listDataChild.put(listDataHeader.get(5),six);
        listDataChild.put(listDataHeader.get(6),seven);

    }


}
