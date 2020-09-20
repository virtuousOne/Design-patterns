package com.design.designpatterns.singleton.promotion;

/**
 * @Author: 吴宸煊
 * Date: 2020/7/4 11:42
 * Description: 返现策略模式
 */
public class CashBackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额到支付宝");
    }
}
