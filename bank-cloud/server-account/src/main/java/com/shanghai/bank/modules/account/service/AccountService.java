package com.shanghai.bank.modules.account.service;

/**
 * @author YeJR
 * @version 1.0
 * @date 2019/9/3 11:12
 */
public interface AccountService {

    /**
     * 开户
     * @param name
     * @param idCard
     * @param cardNum
     * @return
     */
    Boolean openAccount(String name, String idCard, String cardNum);
}
