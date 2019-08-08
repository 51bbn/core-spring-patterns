package io.spring2go.corespring.decorator2;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 工厂类
 * @author wei.zhang
 * @date 2019/8/7 17:44
 */
public class PromotionFactory {


    public static BigDecimal getPayMoney(OrderDetail orderDetail) {

        // 获取给商品设定的促销类型（几种优惠方式）
        Map<PromotionType, SupportPromotions> supportPromotionslist = orderDetail.getMerchandise().getSupportPromotions();

        // 初始化计算类
        IBaseCount baseCount = new BaseCount();
        if (supportPromotionslist != null && supportPromotionslist.size() > 0) {
            // 遍历设置的促销类型，通过装饰器组合促销类型
            for (PromotionType promotionType : supportPromotionslist.keySet()) {
                baseCount = protmotion(supportPromotionslist.get(promotionType), baseCount);
            }
        }
        return baseCount.countPayMoney(orderDetail);
    }

    /**
     * 组合促销类型
     *
     * @param supportPromotions
     * @param baseCount
     * @return
     */
    private static IBaseCount protmotion(SupportPromotions supportPromotions, IBaseCount baseCount) {
        // 优惠券 优惠
        if (supportPromotions.getPromotionType() == PromotionType.COUPON) {
            baseCount = new CouponDecorator(baseCount);

        // 红包 优惠
        } else if (supportPromotions.getPromotionType() == PromotionType.REDPACKED) {
            baseCount = new RedPacketDecorator(baseCount);
        }
        return baseCount;
    }
}
