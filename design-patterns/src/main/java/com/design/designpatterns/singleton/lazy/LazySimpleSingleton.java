package com.design.designpatterns.singleton.lazy;

/**
 * @Author: 吴宸煊
 * Date: 2020/4/10 22:46
 * Description: 懒汉式
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazy = null;

    private LazySimpleSingleton() {

    }

    public static LazySimpleSingleton getInstance() {
        lazy = new LazySimpleSingleton();
        return lazy;
    }
}
