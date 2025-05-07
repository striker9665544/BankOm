package com.banksphereom.controller;

import com.banksphereom.model.Account;
import com.banksphereom.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired private AccountService service;

    @GetMapping("/{accountNumber}")
    public Account getAccount(@PathVariable String accountNumber) {
        return service.getAccount(accountNumber);
    }
}
