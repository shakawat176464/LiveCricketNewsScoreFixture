package me.h.shakawat.livecricketnewsscorefixture;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import me.h.shakawat.livecricketnewsscorefixture.T10_Fragment.T10_Fixture_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.T10_Fragment.T10_News_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.T10_Fragment.T10_PointTable_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.T10_Fragment.T10_TeamPlayer_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.ViewPagerAdapter.ViewPagerAdapter;
import me.h.shakawat.livecricketnewsscorefixture.WBBL_Fragment.WBBL_Fixture_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.WBBL_Fragment.WBBL_News_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.WBBL_Fragment.WBBL_PoinTable_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.WBBL_Fragment.WBBL_Team_Player_Fragment;

public class WBBLActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wbbl);



        Toolbar wbblToolBar = (Toolbar) findViewById(R.id.wbblToolbar);

        wbblToolBar.setTitle("WBBL 2018-19");
        setSupportActionBar(wbblToolBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        tabLayout = findViewById(R.id.tabLayoutId);
        viewPager = findViewById(R.id.viewPagerId);

        setDataWithViewPagers();

        tabLayout.setupWithViewPager(viewPager);

    }

    private void setDataWithViewPagers() {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragments(new WBBL_News_Fragment(),"News");
        adapter.addFragments(new WBBL_Fixture_Fragment(),"Fixture");
        adapter.addFragments(new WBBL_Team_Player_Fragment(),"Team & Player");
        adapter.addFragments(new WBBL_PoinTable_Fragment(),"Point Table");

        viewPager.setAdapter(adapter);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

}