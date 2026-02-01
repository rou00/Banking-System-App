package com.example.Bank.System.App.service.impl;

import com.example.Bank.System.App.dto.AccountDto;
import com.example.Bank.System.App.entity.Account;
import com.example.Bank.System.App.mapper.AccountMapper;
import com.example.Bank.System.App.repository.AccountRepository;
import com.example.Bank.System.App.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(Long accountID) {
        Account account = accountRepository.findById(accountID)
                        .orElseThrow(() -> new RuntimeException("Account Does not Exists!"));
        return AccountMapper.mapToAccountDto(account);
    }

    @Override
    public List<AccountDto> getAccounts() {
        List<Account> accounts = accountRepository.findAll();
        List<AccountDto> accountsDto = new ArrayList<>();
        for(Account c : accounts){
            accountsDto.add(AccountMapper.mapToAccountDto(c));
        }
        return accountsDto;
    }

}
