package me.h.shakawat.livecricketnewsscorefixture;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import me.h.shakawat.livecricketnewsscorefixture.BBL_Fragment.BBL_Fixture_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.BBL_Fragment.BBL_News_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.BBL_Fragment.BBL_PointTable_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.BBL_Fragment.BBL_Team_Player_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.BPL_Fragment.BPL_Fixture_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.BPL_Fragment.BPL_News_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.BPL_Fragment.BPL_PointTable_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.BPL_Fragment.BPL_Team_Player_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.ViewPagerAdapter.ViewPagerAdapter;

public class BBLActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbl);

        Toolbar bblToolBar = (Toolbar) findViewById(R.id.bblToolbar);

        bblToolBar.setTitle("BBL 2018-2019");
        setSupportActionBar(bblToolBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        tabLayout = findViewById(R.id.tabLayoutId);
        viewPager = findViewById(R.id.viewPagerId);

        setDataWithViewPagers();
        tabLayout.setupWithViewPager(viewPager);
    }
    private void setDataWithViewPagers() {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragments(new BBL_News_Fragment(),"News");
        adapter.addFragments(new BBL_Fixture_Fragment(),"Fixture");
        adapter.addFragments(new BBL_Team_Player_Fragment(),"Team & Player");
        adapter.addFragments(new BBL_PointTable_Fragment(),"Point Table");

        viewPager.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

}
