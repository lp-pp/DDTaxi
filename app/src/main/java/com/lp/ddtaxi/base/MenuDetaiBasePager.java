package com.lp.ddtaxi.base;

import android.content.Context;
import android.view.View;

/**
 * @className: MenuDetaiBasePager
 * @author   : Created by lp
 * @e-mail   : 1049345904@qq.com
 * @date     : 2020/8/9 上午10：20
 * @version  : 1.0
 * @desc     : MenuDetaiBasePager 每个对应左侧滑动菜单的detailPager
 */
public abstract class MenuDetaiBasePager {

    /**
     * 上下文
     */
    public final Context context;

    /**
     * 代表每个对应左侧滑动菜单的detailPager
     * 注意：有detail的都是点击左侧slidingMenu对应的detailPager
     * by:tantuo
     */
    public View rootView;//每一个左侧slidingMenu都对应一个右侧的rootView

    public MenuDetaiBasePager(Context context) {
        this.context = context;
        rootView = initView();//抽象方法，每个子页面必须重写 by:tantuo
    }

    /**
     * abstract抽象方法，强制子视图实现该方法，每个页面实现不同的视图
     * 因为每一个detailPager都完全不一样，所以强制它们实现initView方法
     * by:tantuo
     */
    public abstract View initView();


    /**
     * 子页面需要重新绑定数据，联网请求数据等的时候，重写该方法
     */
    public void initData() {

    }
}
