package com.shanghai.bank.modules.account.dao;

import com.shanghai.bank.modules.account.entity.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author YeJR
 * @version 1.0
 * @date 2019/9/1 13:41
 */
@Mapper
public interface AccountDao {

    /**
     * 获取用户的账户信息
     * @param cardNum
     * @param userId
     * @return
     */
    Account getByIdAndCardNum(String cardNum, Integer userId);
}
