package com.shanghai.pay.modules.account.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author YeJR
 * @version 1.0
 * @date 2019/9/1 13:41
 */
@Data
public class Account {

    /**
     * 账户ID
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 银行卡号
     */
    private String cardNum;

}
