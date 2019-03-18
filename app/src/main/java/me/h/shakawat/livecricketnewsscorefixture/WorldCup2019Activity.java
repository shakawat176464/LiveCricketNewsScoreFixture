package me.h.shakawat.livecricketnewsscorefixture;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import me.h.shakawat.livecricketnewsscorefixture.ViewPagerAdapter.ViewPagerAdapter;
import me.h.shakawat.livecricketnewsscorefixture.WorldCup_Fragment.WorldCup_Fixture_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.WorldCup_Fragment.WorldCup_News_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.WorldCup_Fragment.WorldCup_PointTable_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.WorldCup_Fragment.WorldCup_Team_player_Fragment;

public class WorldCup2019Activity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world_cup2019);


        Toolbar worldCuptoolBar = (Toolbar) findViewById(R.id.worldCupToolbar);
        worldCuptoolBar.setTitle("World Cup 2019");
        setSupportActionBar(worldCuptoolBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        tabLayout = findViewById(R.id.tabLayoutId);
        viewPager = findViewById(R.id.viewPagerId);

        setDataWithViewPagers();

        tabLayout.setupWithViewPager(viewPager);

    }
    private void setDataWithViewPagers() {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragments(new WorldCup_News_Fragment(),"News");
        adapter.addFragments(new WorldCup_Fixture_Fragment(),"Fixture");
        adapter.addFragments(new WorldCup_Team_player_Fragment(),"Team & Player");
        adapter.addFragments(new WorldCup_PointTable_Fragment(),"Point Table");

        viewPager.setAdapter(adapter);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
