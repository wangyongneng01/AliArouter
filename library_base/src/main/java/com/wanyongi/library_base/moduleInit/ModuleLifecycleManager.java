package com.wanyongi.library_base.moduleInit;

import android.app.Application;

import androidx.annotation.Nullable;

/**
 * Created by wangyongi on 2020/5/29.
 */
public class ModuleLifecycleManager {

    private static final String BaseInit = "com.wanyongi.library_base.moduleInit.BaseModuleInit";
//    //主业务模块
//    private static final String MainInit = "com.wanyongi.library_base.moduleInit.BaseModuleInit";
//    //热点模块
//    private static final String HOTInit = "com.wanyongi.library_base.moduleInit.BaseModuleInit";
//    //信息模块
//    private static final String MESSAGEInit = "com.wanyongi.library_base.moduleInit.BaseModuleInit";
//    //我的模块
//    private static final String MINEInit = "com.wanyongi.library_base.moduleInit.BaseModuleInit";

    public static String[] initModuleNames = {BaseInit};


    private static class SingletonHolder {
        public static ModuleLifecycleManager instance = new ModuleLifecycleManager();
    }

    public static ModuleLifecycleManager getInstance() {
        return SingletonHolder.instance;
    }

    private ModuleLifecycleManager() {}

    //初始化组件-靠前
    public void initModuleAhead(@Nullable Application application) {
        for (String moduleInitName : initModuleNames) {
            try {
                Class<?> clazz = Class.forName(moduleInitName);
                IModuleInit init = (IModuleInit) clazz.newInstance();
                //调用初始化方法
                init.onInitAhead(application);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    //初始化组件-靠后
    public void initModuleLow(@Nullable Application application) {
        for (String moduleInitName : initModuleNames) {
            try {
                Class<?> clazz = Class.forName(moduleInitName);
                IModuleInit init = (IModuleInit) clazz.newInstance();
                //调用初始化方法
                init.onInitLow(application);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
