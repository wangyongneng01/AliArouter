package com.wanyongi.module_message;

import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.wanyongi.library_base.base.BaseActivity;
import com.wanyongi.library_base.router.RouterActivityPath;
import com.wanyongi.module_message.databinding.ActivityMessageBinding;

@Route(path = RouterActivityPath.Message.PAGER_MESSAGE)
public class MessageActivity extends BaseActivity<ActivityMessageBinding> {

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mViewbinding.click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(RouterActivityPath.Main.PAGER_MAIN).navigation();
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_message;
    }
}
