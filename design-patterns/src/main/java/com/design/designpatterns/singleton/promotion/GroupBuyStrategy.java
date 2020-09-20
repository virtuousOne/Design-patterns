package com.design.designpatterns.singleton.promotion;

/**
 * @Author: 吴宸煊
 * Date: 2020/7/4 11:43
 * Description: 拼团策略模式
 */
public class GroupBuyStrategy implements  PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("拼团，满20人成团，全团享受团购价");
    }
}
