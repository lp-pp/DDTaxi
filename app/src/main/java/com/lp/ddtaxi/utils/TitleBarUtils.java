package com.lp.ddtaxi.utils;

import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;

import com.lp.ddtaxi.R;

/**
 * @className: TitleBarUtils
 * @author   : Created by lp
 * @e-mail   : 1049345904@qq.com
 * @date     : 2020/8/9 上午10：20
 * @version  : 1.0
 * @desc     : WebDetailActivityUtils  webDetailsActivity跳转类
 */
public class TitleBarUtils {

    public static void initTitleBarButton (final Activity activity, View view) {
        ImageButton ib_titlebaback = view.findViewById(R.id.ib_titlebar_back);

        ib_titlebaback.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //点击返回
                    activity.finish();
                }
            });
        }


}