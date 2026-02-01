package com.example.Bank.System.App.mapper;

import com.example.Bank.System.App.dto.AccountDto;
import com.example.Bank.System.App.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto){
        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderFirstName(),
                accountDto.getAccountHolderLastName(),
                accountDto.getBalance()
        );
        return account;
    }

    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderFirstName(),
                account.getAccountHolderLastName(),
                account.getBalance()
        );
        return accountDto;
    }
}
