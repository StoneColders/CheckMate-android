package com.stonecolders.checkmate;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.stonecolders.checkmate.dash.DocFragment;
import com.stonecolders.checkmate.dash.NewsFragment;
import com.stonecolders.checkmate.dash.VaultFragment;

public class fragmentPagerAdapter extends FragmentPagerAdapter {

    public fragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                DocFragment docFragment = new DocFragment();
                return docFragment;
            case 1:
                NewsFragment newsFragment = new NewsFragment();
                return newsFragment;
            case 2:
                VaultFragment vaultFragment = new VaultFragment();
                return vaultFragment;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "Documents";
            case 1: return "News";
            case 2: return "Vault";
        }
        return null;
    }
}
