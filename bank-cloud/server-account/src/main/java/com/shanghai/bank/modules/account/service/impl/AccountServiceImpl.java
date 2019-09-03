package com.shanghai.bank.modules.account.service.impl;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.shanghai.bank.modules.account.dao.UserDao;
import com.shanghai.bank.modules.account.entity.User;
import com.shanghai.bank.modules.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author YeJR
 * @version 1.0
 * @date 2019/9/3 11:13
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AccountServiceImpl implements AccountService {

    @Autowired
    private UserDao userDao;

    /**
     * 开户
     * @param name
     * @param idCard
     * @param cardNum
     * @return
     */
    @Override
    public Boolean openAccount(String name, String idCard, String cardNum) {

        return null;
    }
}
