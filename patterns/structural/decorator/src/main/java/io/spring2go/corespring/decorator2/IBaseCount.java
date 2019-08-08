package io.spring2go.corespring.decorator2;

import java.math.BigDecimal;

/**
 * 单价计算接口(待装饰对象的公共接口)
 */
public interface IBaseCount {
    BigDecimal countPayMoney(OrderDetail orderDetail);
}
