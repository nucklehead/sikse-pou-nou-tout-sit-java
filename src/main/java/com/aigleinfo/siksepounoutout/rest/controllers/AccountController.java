package com.aigleinfo.siksepounoutout.rest.controllers;

import com.aigleinfo.siksepounoutout.model.Account;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aigleinfo.siksepounoutout.repository.AccountRepository;

import java.util.List;

@RestController
@RequestMapping("/api/account")
@Api
public class AccountController {
    @Autowired
    AccountRepository accountRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/")
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{accountID}")
    public Account getAccountById(String accountID) {
        return accountRepository.findOne(accountID);
    }


    @RequestMapping(method = RequestMethod.PUT, path = "/{accountID}")
    public Account updateAccount(String accountID, Account account) {
        account.id = accountID;
        return accountRepository.save(account);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{accountID}")
    public void deleteAccountById(String accountID) {
        accountRepository.delete(accountID);
    }
}
