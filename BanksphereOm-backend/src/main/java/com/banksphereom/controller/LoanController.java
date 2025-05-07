package com.banksphereom.controller;

import com.banksphereom.model.Loan;
import com.banksphereom.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/loan")
public class LoanController {
    @Autowired private LoanService service;

    @PostMapping("/apply")
    public Loan apply(@RequestParam String accountNumber, @RequestParam Double amount) {
        return service.createLoan(accountNumber, amount, 5.0, 12);
    }
}
