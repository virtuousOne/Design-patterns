package com.design.designpatterns.singleton.promotion;

/**
 * @Author: 吴宸煊
 * Date: 2020/7/4 11:47
 * Description:
 */
public class PromotionActivityTest {

  /*  public static void main(String[] args) {
       PromotionActivity activity = new PromotionActivity(new CouponStrategy());
       PromotionActivity activity1 = new PromotionActivity(new CashBackStrategy());
       activity.execute();
       activity1.execute();
    }*/


    public static void main(String[] args) {
        String promotionKey = "GROUPBUY";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execute();

    }

}
