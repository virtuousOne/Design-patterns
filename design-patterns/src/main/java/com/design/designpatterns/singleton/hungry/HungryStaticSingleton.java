package com.design.designpatterns.singleton.hungry;

/**
 * @Author: 吴宸煊
 * Date: 2020/4/10 22:42
 * Description: 饿汉模式
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {

    }

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}
