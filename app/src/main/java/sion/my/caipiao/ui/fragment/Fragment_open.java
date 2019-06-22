package sion.my.caipiao.ui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import sion.my.caipiao.R;
import sion.my.caipiao.bean.DressRehearsal;

@SuppressLint("ValidFragment")
public class Fragment_open extends Fragment {
    public Fragment_open(List<DressRehearsal.ResultBean> result) {
        this.result = result;
    }

    List<DressRehearsal.ResultBean> result;
    private TabLayout fragment_open_tb;
    private ViewPager fragment_open_vp;
    private List<Fragment> fragments=new ArrayList<>();
    private List<String> titles=new ArrayList<>();
    private Activity activity;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        activity=getActivity();


        View view = inflater.inflate(R.layout.fragment_open, container, false);
        initView(view);
        return view;
    }
    private void initView(View view) {
        fragment_open_tb = (TabLayout) view.findViewById(R.id.fragment_open_tb);
        fragment_open_vp = (ViewPager) view.findViewById(R.id.fragment_open_vp);
        for (int i = 0; i < result.size(); i++) {
            AddFragment(new Fragment_open_item(result.get(i).getLottery_id()),result.get(i).getLottery_name());
        }
        Fragmentadapter fragmentadapter=new Fragmentadapter(getFragmentManager(),fragments,titles);
        fragment_open_vp.setAdapter(fragmentadapter);
        fragment_open_tb.setupWithViewPager(fragment_open_vp);
    }
    public void AddFragment(Fragment fragment,String title){
        fragments.add(fragment);
        titles.add(title);
    }
}
