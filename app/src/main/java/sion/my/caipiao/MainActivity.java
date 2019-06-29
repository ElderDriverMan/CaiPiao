package sion.my.caipiao;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import sion.my.caipiao.ui.fragment.Fragment_home;
import sion.my.caipiao.ui.fragment.Fragment_myself;
import sion.my.caipiao.ui.fragment.Fragment_open;
import sion.my.caipiao.ui.fragment.Fragmentadapter;
import sion.my.caipiao.bean.DressRehearsal;
import sion.my.caipiao.until.Okhttpuntil;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private List<Fragment> fragmentList;
    private List<Drawable> icons;
    private ViewPager myvp;
    private TabLayout tablayout;
    List<Fragment> fragments=new ArrayList<>();
    List<String> titles=new ArrayList<>();
    Fragmentadapter fragmentadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }



    private void initView() {
        myvp = (ViewPager) findViewById(R.id.myvp);
        tablayout = (TabLayout) findViewById(R.id.tablayout);
        initdata();

    }

    public void AddFragment(Fragment fragment,String title){
        fragments.add(fragment);
        titles.add(title);
    }
    private void initdata() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    DressRehearsal dressRehearsal_bean = Okhttpuntil.synGetRequesr("https://apis.juhe.cn/lottery/types?key=f79ead77b38f642fbe6555a2b8f6705d", DressRehearsal.class);
                    if (dressRehearsal_bean != null) {
                        if ("查询成功".equals(dressRehearsal_bean.getReason())) {
                            List<DressRehearsal.ResultBean> result = dressRehearsal_bean.getResult();
                            /*int drawable = result.get(0).getDrawable();*/
                            for (int i = 0; i < result.size(); i++) {
                                DressRehearsal.ResultBean resultBean = result.get(i);
                                String lotteryName = resultBean.getLottery_id();
                                resultBean.setDrawable(getResources().getDrawable(getimg(lotteryName)));
                                result.set(i, resultBean);
                            }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {


                        AddFragment(new Fragment_home(result),"最新开奖");
                        AddFragment(new Fragment_open(result),"历史开奖");
                        AddFragment(new Fragment_myself(),"个人中心");
                        tablayout.setSelectedTabIndicatorHeight(0);
                        fragmentadapter=new Fragmentadapter(getSupportFragmentManager(),fragments,titles);
                        myvp.setAdapter(fragmentadapter);
                        tablayout.setupWithViewPager(myvp);
                        myvp.setOffscreenPageLimit(5);

                    }
                });

                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();


                }
            }
        }).start();
    }
    public int getimg(String name) {
        int drawable = getResources().getIdentifier(name, "drawable", getPackageName());
        return drawable;
    }
}
