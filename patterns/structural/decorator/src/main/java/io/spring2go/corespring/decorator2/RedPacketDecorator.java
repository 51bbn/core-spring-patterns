package io.spring2go.corespring.decorator2;

import java.math.BigDecimal;

/**
 * 红包优惠装饰
 *
 * @author wei.zhang
 * @date 2019/8/7 17:42
 */
public class RedPacketDecorator extends BaseCountDecorator {

    public RedPacketDecorator(IBaseCount count) {
        super(count);
    }

    public BigDecimal countPayMoney(OrderDetail orderDetail) {
        BigDecimal payTotalMoney = new BigDecimal(0);
        super.countPayMoney(orderDetail);
        payTotalMoney = countRedPacketPayMoney(orderDetail);
        return payTotalMoney;
    }

    private BigDecimal countRedPacketPayMoney(OrderDetail orderDetail) {

        BigDecimal redPacket = orderDetail.getMerchandise()
                                          .getSupportPromotions()
                                          .get(PromotionType.REDPACKED)
                                          .getUserRedPacket().getRedPacket();
        System.out.println("红包优惠金额：" + redPacket);

        orderDetail.setPayMoney(orderDetail.getPayMoney().subtract(redPacket));
        return orderDetail.getPayMoney();
    }
}