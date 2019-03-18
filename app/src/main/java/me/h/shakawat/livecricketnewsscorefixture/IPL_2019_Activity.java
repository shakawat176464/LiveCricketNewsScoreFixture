package me.h.shakawat.livecricketnewsscorefixture;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import me.h.shakawat.livecricketnewsscorefixture.BPL_Fragment.BPL_Fixture_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.BPL_Fragment.BPL_News_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.BPL_Fragment.BPL_PointTable_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.BPL_Fragment.BPL_Team_Player_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.IPL_Fragment.IPL_Fixture_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.IPL_Fragment.IPL_News_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.IPL_Fragment.IPL_PoinTable_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.IPL_Fragment.IPL_Team_Player_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.ViewPagerAdapter.ViewPagerAdapter;

public class IPL_2019_Activity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipl_2019_);

        Toolbar iplToolBar = (Toolbar) findViewById(R.id.ipl_2019Toolbar);

        iplToolBar.setTitle("IPL 2019");
        setSupportActionBar(iplToolBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        tabLayout = findViewById(R.id.tabLayoutId);
        viewPager = findViewById(R.id.viewPagerId);

        setDataWithViewPagers();

        tabLayout.setupWithViewPager(viewPager);

    }

    private void setDataWithViewPagers() {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragments(new IPL_News_Fragment(),"News");
        adapter.addFragments(new IPL_Fixture_Fragment(),"Fixture");
        adapter.addFragments(new IPL_Team_Player_Fragment(),"Team & Player");
        adapter.addFragments(new IPL_PoinTable_Fragment(),"Point Table");

        viewPager.setAdapter(adapter);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

}

