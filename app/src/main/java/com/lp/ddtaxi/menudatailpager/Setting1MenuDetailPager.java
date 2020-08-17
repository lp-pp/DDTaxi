package com.lp.ddtaxi.menudatailpager;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.lp.ddtaxi.base.MenuDetaiBasePager;
import com.lp.ddtaxi.utils.LogUtil;


/**
 * @className: Setting1MenuDetailPager
 * @author   : Created by lp
 * @e-mail   : 1049345904@qq.com
 * @date     : 2020/8/15 上午10：20
 * @version  : 1.0
 * @desc     :
 */
public class Setting1MenuDetailPager extends MenuDetaiBasePager {
    private TextView textView;

    public Setting1MenuDetailPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        textView = new TextView(context);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        textView.setTextSize(25);

        return textView;
    }


    @Override
    public void initData() {
        super.initData();
        textView.setText("slidingMenu第二行");
        LogUtil.i("slidingMenu第二行");

    }
}
