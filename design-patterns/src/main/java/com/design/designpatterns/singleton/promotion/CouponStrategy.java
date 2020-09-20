package com.design.designpatterns.singleton.promotion;

/**
 * @Author: 吴宸煊
 * Date: 2020/7/4 11:41
 * Description: 领取优惠券策略模式
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券策略模式");
    }
}
