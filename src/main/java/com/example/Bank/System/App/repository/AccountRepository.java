package com.example.Bank.System.App.repository;

import com.example.Bank.System.App.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {

}
