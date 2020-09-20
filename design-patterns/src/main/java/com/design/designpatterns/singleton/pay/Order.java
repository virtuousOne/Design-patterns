package com.design.designpatterns.singleton.pay;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 吴宸煊
 * Date: 2020/7/5 8:59
 * Description:
 */
@Data
public class Order implements Serializable {
    private String uid;

    private String orderId;

    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public MsgResult pay(String payKey){
        Payment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额为：" + amount + "，开始扣款...");
        return payment.pay(uid,amount);
    }
}
