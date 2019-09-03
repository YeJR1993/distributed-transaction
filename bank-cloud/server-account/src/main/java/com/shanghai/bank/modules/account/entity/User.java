package com.shanghai.bank.modules.account.entity;

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
     * 用户名
     */
    private String userName;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 入户时间
     */
    private Date createTime;
}
