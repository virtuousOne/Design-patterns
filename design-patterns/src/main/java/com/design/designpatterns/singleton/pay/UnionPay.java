package com.design.designpatterns.singleton.pay;

/**
 * @Author: 吴宸煊
 * Date: 2020/7/5 9:10
 * Description:
 */
public class UnionPay extends Payment {
    public String getName() {
        return "银联支付";
    }

    protected double queryBalance(String uid) {
        return 120;
    }
}
