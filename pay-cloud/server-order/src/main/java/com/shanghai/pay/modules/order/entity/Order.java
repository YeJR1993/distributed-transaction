package com.shanghai.pay.modules.order.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

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
    private BigDecimal price;

    /**
     * 0：创建，1：成功，2：失败
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;
}
