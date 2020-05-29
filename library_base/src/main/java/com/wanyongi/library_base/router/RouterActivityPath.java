package com.wanyongi.library_base.router;

/**
 * Created by wangyongi on 2020/5/29.
 */
public class RouterActivityPath {
    /**
     * 主业务组件
     */
    public static class Main {
        private static final String MAIN = "/main";
        /*主业务界面*/
        public static final String PAGER_MAIN = MAIN +"/MainActivity";
    }

    /**
     * 热点组件
     */
    public static class Hot {
        private static final String HOT = "/hot";
        /*登录界面*/
        public static final String PAGER_HOT = HOT + "/HotActivity";
    }

    /**
     * 用户组件
     */
    public static class Mine {
        private static final String MINE = "/mine";
        /*用户详情*/
        public static final String PAGER_MINE = MINE + "/MineActivity";
    }

    /**
     * 信息组件
     */
    public static class Message {
        private static final String MESSAGE = "/message";
        /*用户详情*/
        public static final String PAGER_MESSAGE = MESSAGE + "/MessageActivity";
    }
}
