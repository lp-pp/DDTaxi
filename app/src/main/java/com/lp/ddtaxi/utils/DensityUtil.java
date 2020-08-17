package com.tantuo.didicar.utils;

import android.content.Context;

/**
 * @className: DensityUtil
 * @author   : Created by lp
 * @e-mail   : 1049345904@qq.com
 * @date     : 2020/8/15 上午10：20
 * @version  : 1.0
 * @desc     : px和dp互相转换工具类
 */
public class DensityUtil {
    /**
     * 根据手机的分辨率从 dip 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
