package com.lp.ddtaxi.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.viewpager.widget.PagerAdapter;

import com.lp.ddtaxi.base.BasePager;

import java.util.ArrayList;

/**
 * @className: ContentFragmentAdapter
 * @author   : Created by lp
 * @e-mail   : 1049345904@qq.com
 * @date     : 2020/8/10 上午10：20
 * @version  : 1.0
 * @desc     : ContentFragmentAdapter 屏幕正中央的ViewPager
 */

public class ContentFragmentAdapter extends PagerAdapter {

    private final ArrayList<BasePager> basePagers;

    public ContentFragmentAdapter(ArrayList<BasePager> basePagers) {
        this.basePagers = basePagers;
    }

    @Override
    public int getCount() {

        return basePagers.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        BasePager basePager = basePagers.get(position);//各个页面的实例
        View rootView = basePager.rootView;//各个子页面

        //调用initData()
        //注意：这里的initData()看上去调用的是basePager,肯定是调用的是各个子类pager的。
        basePager.initData();//初始化数据

        container.addView(rootView);
        return rootView;
    }


    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}