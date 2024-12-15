package com.banking.accounts.dtos;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data@AllArgsConstructor
public class CustomerDto {
    public String name;
    public String email;
    public String mobileNumber;
}
