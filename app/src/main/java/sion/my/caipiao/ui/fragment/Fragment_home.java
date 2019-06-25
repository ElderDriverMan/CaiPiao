package sion.my.caipiao.ui.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.util.List;

import sion.my.caipiao.BR;
import sion.my.caipiao.R;
import sion.my.caipiao.adapters.ActivityMainItemAdapter;
import sion.my.caipiao.bean.DressRehearsal;
import sion.my.caipiao.databinding.FragmentHomeBinding;

import sion.my.caipiao.ui.activity.NewResultActivity;
import sion.my.caipiao.ui.views.MyGridView;
import sion.my.caipiao.ui.views.MyListView;

@SuppressLint("ValidFragment")
public class Fragment_home extends Fragment {
    FragmentActivity activity;
    FragmentHomeBinding fragmentHomeBinding;
    List<DressRehearsal.ResultBean> result;
    private MyListView mygv;

    public Fragment_home(List<DressRehearsal.ResultBean> result) {
        this.result = result;
    }

    private View view;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        activity = getActivity();
        fragmentHomeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        view = fragmentHomeBinding.getRoot();
        ActivityMainItemAdapter<DressRehearsal.ResultBean> activityMainItemAdapter = new ActivityMainItemAdapter(result, activity, R.layout.activity_main_item, BR.myresult);
        fragmentHomeBinding.setAdapter(activityMainItemAdapter);
        initView(view);
        return view;
    }


   private void initView(View view) {
        mygv = (MyListView) view.findViewById(R.id.ggvv);
        mygv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(activity, NewResultActivity.class);
                intent.putExtra("lottery_id",result.get(position).getLottery_id());
                startActivity(intent);
            }
        });
    }
}
