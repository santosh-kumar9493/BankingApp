package com.banking.accounts.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Collate;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Account extends BaseEntity {
    @Id
    @Column(name = "account_number")
    public Long accountNumber;
    @Column(name = "customer_id")
    public Long customerId;
    @Column(name = "account_type")
    public String accountType;
    @Column(name = "branch_address")
    public String branchAddress;
}
