package com.example.Bank.System.App.service;

import com.example.Bank.System.App.dto.AccountDto;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto account);
    AccountDto getAccountById(Long accountID);
    List<AccountDto> getAccounts();
    AccountDto deposit(Long id, double amout);
    AccountDto withdraw(Long id, double amout);
    String deleteAccount(Long id);
}
