package com.shanghai.bank.modules.order.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author YeJR
 * @version 1.0
 * @date 2019/9/1 14:45
 */
@Data
public class Order {

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 账户ID
     */
    private Long accountId;

    /**
     * 订单编号
     */
    private String orderNum;

    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 0：扣款，1：存款
     */
    private Integer flow;

    /**
     * 0：创建，1：成功，2：失败
     */
    private Integer status;
}
