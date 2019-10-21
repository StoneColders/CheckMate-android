package com.stonecolders.checkmate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class DashActivity extends AppCompatActivity {

    private fragmentPagerAdapter adapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);
        Toolbar toolbar = findViewById(R.id.toolbar);
        adapter = new fragmentPagerAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.pager);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
