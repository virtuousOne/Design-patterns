package com.design.designpatterns.singleton.pay;

/**
 * @Author: 吴宸煊
 * Date: 2020/7/5 9:10
 * Description:
 */
public class JDPay extends Payment {
    public String getName() {
        return "京东白条";
    }

    protected double queryBalance(String uid) {
        return 500;
    }
}
