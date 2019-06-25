package sion.my.caipiao.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.IOException;

import sion.my.caipiao.BR;
import sion.my.caipiao.R;
import sion.my.caipiao.adapters.ActivityMainItemAdapter;
import sion.my.caipiao.bean.LotteyrResult;
import sion.my.caipiao.databinding.ActivityNewresultBinding;
import sion.my.caipiao.until.Okhttpuntil;

public class NewResultActivity extends AppCompatActivity {
    ActivityNewresultBinding binding;
    private TextView title;
    String lottery_id ;
    private Activity activity;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        lottery_id=intent.getStringExtra("lottery_id");
        binding = DataBindingUtil.setContentView(this, R.layout.activity_newresult);
        initView();
        initdata();
    }

    private void initdata() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    LotteyrResult lotteyrResult = Okhttpuntil.synGetRequesr("http://apis.juhe.cn/lottery/query?key=fe9b5008f6d1a5b000badcd372a7b261&lottery_id=" + lottery_id,
                            LotteyrResult.class);
                    if(lotteyrResult!=null){
                        ActivityMainItemAdapter<LotteyrResult.ResultBean.LotteryPrizeBean> activityMainItemAdapter=
                                new ActivityMainItemAdapter(lotteyrResult.getResult().getLottery_prize(),NewResultActivity.this,R.layout.fragment_newresult_item, BR.lotteyrresult);
                        binding.setThirdadapter(activityMainItemAdapter);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                title.setText(lotteyrResult.getResult().getLottery_name());
                            }
                        });
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void initView() {
        title = (TextView) findViewById(R.id.title);

    }
}
