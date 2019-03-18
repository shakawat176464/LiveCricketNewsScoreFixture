package me.h.shakawat.livecricketnewsscorefixture;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import me.h.shakawat.livecricketnewsscorefixture.PSL_Fragment.PSL_Fixture_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.PSL_Fragment.PSL_News_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.PSL_Fragment.PSL_PoinTable_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.PSL_Fragment.PSL_Team_Player_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.T10_Fragment.T10_Fixture_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.T10_Fragment.T10_News_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.T10_Fragment.T10_PointTable_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.T10_Fragment.T10_TeamPlayer_Fragment;
import me.h.shakawat.livecricketnewsscorefixture.ViewPagerAdapter.ViewPagerAdapter;

public class PSLActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psl);

        Toolbar pslToolBar = (Toolbar) findViewById(R.id.pslToolbar);

        pslToolBar.setTitle("PSL 2018-19");
        setSupportActionBar(pslToolBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        tabLayout = findViewById(R.id.tabLayoutId);
        viewPager = findViewById(R.id.viewPagerId);

        setDataWithViewPagers();

        tabLayout.setupWithViewPager(viewPager);

    }

    private void setDataWithViewPagers() {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragments(new PSL_News_Fragment(),"News");
        adapter.addFragments(new PSL_Fixture_Fragment(),"Fixture");
        adapter.addFragments(new PSL_Team_Player_Fragment(),"Team & Player");
        adapter.addFragments(new PSL_PoinTable_Fragment(),"Point Table");

        viewPager.setAdapter(adapter);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

}
