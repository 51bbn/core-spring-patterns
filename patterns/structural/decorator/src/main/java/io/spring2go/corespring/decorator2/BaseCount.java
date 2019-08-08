package io.spring2go.corespring.decorator2;

import java.math.BigDecimal;

/**
 * 基础的单价计算（待装饰的实际对象）
 *
 * @author wei.zhang
 * @date 2019/8/7 17:30
 */
public class BaseCount implements IBaseCount {
    public BigDecimal countPayMoney(OrderDetail orderDetail) {
        // 商品的单价
        orderDetail.setPayMoney(orderDetail.getMerchandise().getPrice());
        System.out.println("商品原单价金额为：" + orderDetail.getPayMoney());
        return orderDetail.getPayMoney();
    }
}