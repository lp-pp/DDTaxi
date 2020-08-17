package com.lp.ddtaxi.base;

import android.content.Context;
import android.view.View;

/**
 * @className: BaseCallCarTabPager
 * @author   : Created by lp
 * @e-mail   : 1049345904@qq.com
 * @date     : 2020/8/10 上午10：20
 * @version  : 1.0
 * @desc     : BaseCallCarTabPager 对应的是打车界面点击TabIndicator对应的TabPager
 */
public abstract class BaseCallCarTabPager {
    /**
     * 上下文
     */
    public final Context context;

    /**
     * 代表每个对应TabIndicator 的detailPager
     * 注意：有Tab的都是点击上边viewPagerIndicator(快车，出租车)对应的detailPager
     */
    public View rootView;

    public BaseCallCarTabPager(Context context) {
        this.context = context;
        rootView = initView();//抽象方法，每个子页面必须重写
    }

    /**
     * abstract抽象方法，强制子视图实现该方法，每个页面实现不同的视图
     * 因为每一个CallCarTabPager都完全不一样，所以强制它们实现initView方法
     */
    public abstract View initView();


    /**
     * 子页面需要重新绑定数据，联网请求数据等的时候，重写该方法
     */
    public void initData() {

    }

    public void removeMaps(){

    }
}