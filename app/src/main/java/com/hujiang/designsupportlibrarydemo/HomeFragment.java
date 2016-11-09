package com.hujiang.designsupportlibrarydemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dandan.Cao on 2016/11/2.
 */
public class HomeFragment extends Fragment {
    private List<Fragment> fragments = new ArrayList<>();
    private List<String> titles = new ArrayList<>();
    private ViewPager mViewPager;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_main, null);
        mViewPager= (ViewPager) view.findViewById(R.id.viewpager);
        titles.add("进行中");
        titles.add("已完成");
        titles.add("未开始");
        titles.add("关注");
        fragments.add(new ListFragment());
        fragments.add(new ListFragment());
        fragments.add(new ListFragment());
        fragments.add(new ListFragment());
        FragmentAdapter adapter = new FragmentAdapter(getFragmentManager(), fragments, titles);
        mViewPager.setAdapter(adapter);
        return view;
    }
}