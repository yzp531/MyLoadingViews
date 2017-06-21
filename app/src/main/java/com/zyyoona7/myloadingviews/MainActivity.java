package com.zyyoona7.myloadingviews;

import android.view.View;
import android.widget.Button;

import com.zyyoona7.myloadingviews.progress.activity.AliPayActivity;
import com.zyyoona7.myloadingviews.progress.activity.IndicatorActivity;
import com.zyyoona7.myloadingviews.progress.activity.RingActivity;

public class MainActivity extends BaseActivity {
    private Button mJuHuaBtn;
    private Button mRingBtn;
    private Button mAliPayBtn;

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews() {
        mJuHuaBtn = (Button) findViewById(R.id.btn_juhua);
        mRingBtn = (Button) findViewById(R.id.btn_ring);
        mAliPayBtn = (Button) findViewById(R.id.btn_alipay);
    }

    @Override
    protected void initEvents() {
        mJuHuaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo(IndicatorActivity.class);
            }
        });

        mRingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo(RingActivity.class);
            }
        });

        mAliPayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo(AliPayActivity.class);
            }
        });
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
