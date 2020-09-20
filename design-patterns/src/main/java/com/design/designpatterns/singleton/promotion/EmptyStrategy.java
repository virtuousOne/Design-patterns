package com.design.designpatterns.singleton.promotion;

/**
 * @Author: 吴宸煊
 * Date: 2020/7/4 11:40
 * Description:  无优惠
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
