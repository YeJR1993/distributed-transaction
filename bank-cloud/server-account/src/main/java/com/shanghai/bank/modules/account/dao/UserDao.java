package com.shanghai.bank.modules.account.dao;

import com.shanghai.bank.modules.account.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author YeJR
 * @version 1.0
 * @date 2019/9/1 13:30
 */
@Mapper
public interface UserDao {

    /**
     * 通过用户ID获取用户信息
     * @param id
     * @return
     */
    User getById(Integer id);
}
