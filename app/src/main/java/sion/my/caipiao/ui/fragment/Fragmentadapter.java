package sion.my.caipiao.ui.fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class Fragmentadapter extends FragmentStatePagerAdapter {
    List<Fragment> fragments;
    List<String> Tabtitle;

    public Fragmentadapter(FragmentManager fm, List<Fragment> fragments, List<String> tabtitle) {
        super(fm);
        this.fragments = fragments;
        Tabtitle = tabtitle;
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return Tabtitle.get(position);
    }
}
