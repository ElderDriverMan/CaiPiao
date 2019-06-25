package sion.my.caipiao.ui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.databinding.library.baseAdapters.BR;

import java.io.IOException;
import java.util.List;

import sion.my.caipiao.R;
import sion.my.caipiao.adapters.ActivityMainItemAdapter;
import sion.my.caipiao.bean.LotteryRecord;
import sion.my.caipiao.databinding.FragmentOpenItemBinding;
import sion.my.caipiao.until.Okhttpuntil;

@SuppressLint("ValidFragment")
public class Fragment_open_item extends Fragment {
    private String lottery_id;
    private Activity activity;
    public Fragment_open_item(String lottery_id) {
        this.lottery_id = lottery_id;
    }

    FragmentOpenItemBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        activity=getActivity();
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_open_item,container,false);
        View root = binding.getRoot();
        initdata();
        return root;
    }
    public void initdata(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    LotteryRecord lotteryRecord = Okhttpuntil.synGetRequesr("http://apis.juhe.cn/lottery/history?key=fe9b5008f6d1a5b000badcd372a7b261&lottery_id=" + lottery_id,
                            LotteryRecord.class);
                    if(lotteryRecord!=null){
                        List<LotteryRecord.ResultBean.LotteryResListBean> lotteryResList = lotteryRecord.getResult().getLotteryResList();
                        ActivityMainItemAdapter activityMainItemAdapter=new ActivityMainItemAdapter(lotteryResList,activity,R.layout.fragment_open_item_item, BR.lottery);
                        binding.setSecondadapter(activityMainItemAdapter);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
