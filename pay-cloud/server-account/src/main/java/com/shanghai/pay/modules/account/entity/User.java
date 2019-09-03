package com.shanghai.pay.modules.account.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author YeJR
 * @version 1.0
 * @date 2019/9/1 13:27
 */
@Data
public class User {

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 状态 0：冻结，1：正常
     */
    private Integer status;
}
