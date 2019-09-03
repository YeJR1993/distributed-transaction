package com.shanghai.pay.modules.integral.entity;

import lombok.Data;

/**
 * @author YeJR
 * @version 1.0
 * @date 2019/9/1 14:09
 */
@Data
public class Integral {

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 积分
     */
    private Long integralNum;
}
