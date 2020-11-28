package com.atilsamancioglu.tabbedjavafragment.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.atilsamancioglu.tabbedjavafragment.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    List<String> getListe;
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;
    List<String> liste;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).

        if (position == 0) {
            return FirstFragment.newInstance();
        } else {
            return SecondFragment.newInstance();
        }

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        liste = new ArrayList<>();
        liste.add("asdasd");
        liste.add("asdasd");
        liste.add("asdasd");
        liste.add("asdasd");
        return liste.get(position);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }
}