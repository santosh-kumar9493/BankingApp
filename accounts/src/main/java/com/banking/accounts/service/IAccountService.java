package com.banking.accounts.service;

import com.banking.accounts.dtos.CustomerDto;

public interface IAccountService {
    public void createAccount(CustomerDto customerDto);
}
