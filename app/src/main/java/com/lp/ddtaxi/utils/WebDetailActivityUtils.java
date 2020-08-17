package com.lp.ddtaxi.utils;

import android.content.Context;
import android.content.Intent;
import com.lp.ddtaxi.Activity.DDInfoActivity;

/**
 * @desc     : WebDetailsActivity跳转类
 * @className: WebDetailActivityUtils
 * @author   : Created by lp
 * @e-mail   : 1049345904@qq.com
 * @date     : 2020/7/25 上午10：20
 * @version  : 1.0
 */

public class WebDetailActivityUtils {

    public static void startDDInfoActivity(Context context, String url) {
        Intent intent = new Intent(context, DDInfoActivity.class);
        intent.putExtra("url", url);
        context.startActivity(intent);
    }
}