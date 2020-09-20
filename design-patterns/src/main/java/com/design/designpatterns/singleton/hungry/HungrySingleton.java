package com.design.designpatterns.singleton.hungry;

/**
 * @Author: 吴宸煊
 * Date: 2020/4/10 22:02
 * Description: 饿汉模式
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
