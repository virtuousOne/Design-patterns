package com.design.designpatterns.singleton.pay;

/**
 * @Author: 吴宸煊
 * Date: 2020/7/5 9:09
 * Description:
 */
public class WeChatPay extends Payment {

    public String getName() {
        return "微信支付";
    }

    protected double queryBalance(String uid) {
        return 256;
    }

}
