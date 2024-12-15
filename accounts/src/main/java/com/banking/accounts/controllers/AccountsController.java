package com.banking.accounts.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @RequestMapping("/accounts")
    public String getAccounts() {
        return "Accounts";
    }
}
