package com.lp.ddtaxi.base;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import com.lp.ddtaxi.MainActivity;
import com.lp.ddtaxi.R;
/**
 * @className: BasePager
 * @author   : Created by lp
 * @e-mail   : 1049345904@qq.com
 * @date     : 2020/8/10 上午10：20
 * @version  : 1.0
 * @desc     : 主界面的基础类
 */
public class BasePager {
    public final Context context;//MainActivity

    public View rootView;

    public TextView tv_title;

    public ImageButton ib_menu;

    public FrameLayout fl_content;//最重要的真布局，用于addfragment加载子叶面

    public ImageButton ib_swich_list_grid;

    public Button btn_cart;

    public BasePager(Context context) {
        this.context = context;
        //构造方法一执行，视图就被初始化
        rootView = initView();
    }

    /**
     * 用于初始化rootview，并且加载子视图的FrameLayout
     *
     * @return
     */

    private View initView() {
        //基类的页面
        View view = View.inflate(context, R.layout.base_pager, null);
        tv_title = (TextView) view.findViewById(R.id.tv_title);
        ib_menu = (ImageButton) view.findViewById(R.id.ib_menu);
        fl_content = (FrameLayout) view.findViewById(R.id.fl_content);

        ib_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //2.把左侧菜单关闭
                MainActivity mainActivity = (MainActivity) context;
                //toggle() 方法会让 slidingMenu开关切换
                mainActivity.getSlidingMenu().toggle();
            }
        });
        return view;
    }

    /**
     * 初始化数据;当子页面需要初始化数据;或者绑定数据;联网请求数据并且绑定的时候，重写该方法
     */
    public void initData() {

    }
}