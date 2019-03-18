package me.h.shakawat.livecricketnewsscorefixture.ViewPagerAdapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
    ArrayList<String> tabTitle = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle.get(position);
    }


    public void addFragments(Fragment fragment, String title)
    {
        fragmentArrayList.add(fragment);
        tabTitle.add(title);
    }
}
