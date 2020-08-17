package com.lp.ddtaxi.base;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * @className: BaseFragment
 * @author   : Created by lp
 * @e-mail   : 1049345904@qq.com
 * @date     : 2020/8/9 上午10：20
 * @version  : 1.0
 * @desc     :
 */

public abstract class BaseFragment extends Fragment {

    protected Context context;
    protected String title;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return initView();
    }

    @Override
    public void onResume() {
        super.onResume();
        //initData();
    }

    @Override
    public void onStart() {
        super.onStart();
        //initData();
    }

    /**
     * 强制继承fragment的子类执行此方法初始化页面
     *
     * @return
     */
    public abstract View initView();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //initData();
    }

    /**
     * 子类初始化数据或者联网请求或者展示数据的时候执行initData()
     */
    public void initData() {
    }


    public String gettitle() {
        return title;
    }
}
