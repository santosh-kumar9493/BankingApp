package com.banking.accounts.service.impl;


import com.banking.accounts.dtos.CustomerDto;
import com.banking.accounts.repositories.AccountRepository;
import com.banking.accounts.repositories.CustomerRepository;
import com.banking.accounts.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountService {

    private AccountRepository accountRepository;
    private CustomerRepository customerRepository;
    public void createAccount(CustomerDto customerDto) {

    }
}
