package com.shanghai.bank.modules.account.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YeJR
 * @version 1.0
 * @date 2019/9/3 10:37
 */
@RestController
@RequestMapping(value = "/bank")
public class AccountController {

    @RequestMapping(value = "/openAccount")
    public Boolean openAccount(String name, String idCard, String cardNum) {

        return false;
    }

}
