package com.banking.accounts.dtos;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class AccountDto {
    public Long accountNumber;
    public String accountType;
    public String branchAddress;
}
