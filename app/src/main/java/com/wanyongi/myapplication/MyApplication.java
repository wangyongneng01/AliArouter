package com.wanyongi.myapplication;

import android.app.Application;

import com.wanyongi.library_base.moduleInit.ModuleLifecycleManager;

/**
 * Created by wangyongi on 2020/5/29.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ModuleLifecycleManager.getInstance().initModuleAhead(this);

        ModuleLifecycleManager.getInstance().initModuleLow(this);


    }
}
