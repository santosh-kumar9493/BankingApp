package com.banking.accounts.dtos;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data@AllArgsConstructor
public class AccountDto {
    public Long accountNumber;
    public String accountType;
    public String branchAddress;
}
