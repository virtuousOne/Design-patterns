package com.design.designpatterns.singleton.pay;

/**
 * @Author: 吴宸煊
 * Date: 2020/7/5 9:08
 * Description:
 */
public class AliPay extends Payment{

    public String getName() {
        return "支付宝";
    }

    protected double queryBalance(String uid) {
        return 900;
    }
}
