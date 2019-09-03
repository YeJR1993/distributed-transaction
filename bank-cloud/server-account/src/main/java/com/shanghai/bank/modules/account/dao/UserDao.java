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
     * 通过姓名和身份证查询用户信息
     * @param userName
     * @param idCard
     * @return
     */
    User getByNameAndCard(String userName, String idCard);
}
