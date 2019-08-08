package io.spring2go.corespring.decorator2;

import java.math.BigDecimal;

/**
 * 计算支付金额的抽象类（定义所有可动态添加功能的公共接口）
 *
 * @author wei.zhang
 * @date 2019/8/7 17:36
 */
public abstract class BaseCountDecorator implements IBaseCount {

    // 引用Component对象
    private IBaseCount count;

    public BaseCountDecorator(IBaseCount count) {
        this.count = count;
    }

    public BigDecimal countPayMoney(OrderDetail orderDetail) {
        BigDecimal payTotalMoney = new BigDecimal(0);
        if (count != null) {
            payTotalMoney = count.countPayMoney(orderDetail);
        }
        return payTotalMoney;
    }
}
