package com.banking.accounts.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor@AllArgsConstructor
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "customer_id")
    public Long customerId;
    public String name;
    public String email;
    @Column(name = "mobile_number")
    public String mobileNumber;
}
