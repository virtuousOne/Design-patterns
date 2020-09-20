package com.design.designpatterns.singleton.lazy;

/**
 * @Author: 吴宸煊
 * Date: 2020/4/10 23:10
 * Description:
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton() {

    }

    // 适中的方案 --双重检查锁
    public static LazyDoubleCheckSingleton getInstance() {
        if (null == lazy) {
            synchronized (LazyDoubleCheckSingleton.lazy) {
                if (null == lazy) {
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }
}
