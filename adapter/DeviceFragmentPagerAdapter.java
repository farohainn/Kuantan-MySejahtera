package com.example.kuantansejahtera_a170567.adapter;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ImageSpan;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.kuantansejahtera_a170567.SubFragment.Info_main;

import com.example.kuantansejahtera_a170567.R;
import com.example.kuantansejahtera_a170567.fragment.Info2Fragment;
import com.example.kuantansejahtera_a170567.fragment.InfoFragment;
import com.example.kuantansejahtera_a170567.fragment.StatisticFragment;
import com.example.kuantansejahtera_a170567.fragment.checkinFragment2;


public class DeviceFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private String[] titles = {"A", "B", "C"};
    int[] icon = new int[]{R.drawable.ic_statistic_black_24dp, R.drawable.ic_info_black_24dp, R.drawable.ic_checkin_black_24dp};
    private int heightIcon;

    public DeviceFragmentPagerAdapter(FragmentManager fm, Context c) {
        super(fm);
        mContext = c;
        double scale = c.getResources().getDisplayMetrics().density;
        heightIcon = (int) (24 * scale + 0.5f);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag = null;

        if (position == 0) {
            frag = new StatisticFragment();
        } else if (position == 1) {
            frag = new Info2Fragment();
        } else if (position == 2) {
            frag = new checkinFragment2();
        }

        Bundle b = new Bundle();
        b.putInt("position", position);
        frag.setArguments(b);
        return frag;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    public CharSequence getPageTitle(int position) {
        Drawable d = mContext.getResources().getDrawable(icon[position]);
        d.setBounds(0, 0, heightIcon, heightIcon);
        ImageSpan is = new ImageSpan(d);

        SpannableString sp = new SpannableString(" ");
        sp.setSpan(is, 0, sp.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return sp;
    }
}

