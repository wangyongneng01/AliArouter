package com.wanyongi.library_base.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

/**
 * Created by wangyongi on 2020/7/15.
 */
public abstract class BaseActivity<B extends ViewDataBinding> extends AppCompatActivity {
    protected B mViewbinding = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewbinding = DataBindingUtil.setContentView(this,getLayoutId());
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int getLayoutId();

    //    open var mViewBinding:B? = null
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        mViewBinding = DataBindingUtil.setContentView(this,getLayoutId())
//        initView()
//        initData()
//    }
//
//    abstract fun initData()
//
//    abstract fun initView()
//
//    abstract fun getLayoutId():Int
}
