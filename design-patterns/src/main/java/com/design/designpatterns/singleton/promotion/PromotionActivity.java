package com.design.designpatterns.singleton.promotion;

/**
 * @Author: 吴宸煊
 * Date: 2020/7/4 11:45
 * Description:
 */
public class PromotionActivity {

    PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute(){
        this.promotionStrategy.doPromotion();
    }
}
