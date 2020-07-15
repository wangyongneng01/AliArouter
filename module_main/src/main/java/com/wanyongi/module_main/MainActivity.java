package com.wanyongi.module_main;

import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.wanyongi.library_base.base.BaseActivity;
import com.wanyongi.library_base.router.RouterActivityPath;
import com.wanyongi.module_main.databinding.ActivityMainBinding;

@Route(path = RouterActivityPath.Main.PAGER_MAIN)
public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView() {
        mViewbinding.click.setText("丢你老母");
        mViewbinding.click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(RouterActivityPath.Message.PAGER_MESSAGE).navigation();
            }
        });
    }
}
