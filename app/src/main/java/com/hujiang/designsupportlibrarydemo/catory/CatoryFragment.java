package com.hujiang.designsupportlibrarydemo.catory;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hujiang.designsupportlibrarydemo.MainActivity;
import com.hujiang.designsupportlibrarydemo.R;

/**
 * Created by V.Wenju.Tian on 2016/11/10.
 */

public class CatoryFragment extends Fragment {

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
       View view = inflater.inflate(R.layout.fragment_catory, container, false);
        TabLayout tabLayout = mainActivity.getTabLayout();
        tabLayout.setVisibility(View.GONE);
        return  view;
    }
}
