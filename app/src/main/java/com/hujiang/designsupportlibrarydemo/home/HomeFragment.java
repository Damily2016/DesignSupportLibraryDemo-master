package com.hujiang.designsupportlibrarydemo.home;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hujiang.designsupportlibrarydemo.ListFragment;
import com.hujiang.designsupportlibrarydemo.MainActivity;
import com.hujiang.designsupportlibrarydemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dandan.Cao on 2016/11/2.
 */
public class HomeFragment extends Fragment {
    private List<Fragment> fragments = new ArrayList<>();
    private List<String> titles = new ArrayList<>();
    private ViewPager mViewPager;
    private MainActivity mainActivity;

    @Override
    public void onAttach(Activity activity) {
        if(activity instanceof MainActivity){
            mainActivity = ((MainActivity) activity);
        }
        super.onAttach(activity);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.homefragment, null);
        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        titles.add("进行中");
        titles.add("已完成");
        titles.add("未开始");
        titles.add("关注");
        TabLayout tabLayout = mainActivity.getTabLayout();
        tabLayout.setVisibility(View.VISIBLE);
        fragments.add(new ListFragment());
        fragments.add(new ListFragment());
        fragments.add(new ListFragment());
        fragments.add(new ListFragment());
        FragmentAdapter adapter = new FragmentAdapter(getFragmentManager(), fragments, titles);
        mViewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(mViewPager);


        return view;
    }


}
