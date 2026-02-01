package com.example.Bank.System.App.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDto {
    private Long id;
    private String accountHolderFirstName;
    private String accountHolderLastName;
    private double balance;
}
