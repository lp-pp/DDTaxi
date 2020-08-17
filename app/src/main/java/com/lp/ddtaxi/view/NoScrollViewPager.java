package com.lp.ddtaxi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.viewpager.widget.ViewPager;

/**
 * @className: NoScrollViewPager
 * @author   : Created by lp
 * @e-mail   : 1049345904@qq.com
 * @date     : 2020/8/10 上午10：20
 * @version  : 1.0
 * @desc     : NoScrollViewPager自定义不可以活动 NoScroll的ViewPager
 */
public class NoScrollViewPager extends ViewPager {
    /**
     * 通常在代码中实例化的时候用该方法
     *
     * @param context
     */
    public NoScrollViewPager(Context context) {
        super(context);
    }

    /**
     * 在布局文件中使用该类的时候，实例化该类用该构造方法，这个方法不能少，少的化会崩溃。
     *
     * @param context
     * @param attrs
     */
    public NoScrollViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 重写触摸事件，消费掉
     *
     * @param ev
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;
    }
}
