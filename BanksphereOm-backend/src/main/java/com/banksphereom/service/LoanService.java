package com.banksphereom.service;

import com.banksphereom.model.Loan;
import com.banksphereom.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {
    @Autowired private LoanRepository loanRepo;

    public Loan createLoan(String accNum, Double principal, Double rate, Integer tenure) {
        double monthly = rate/(12*100);
        double emi = (principal*monthly*Math.pow(1+monthly,tenure))/(Math.pow(1+monthly,tenure)-1);
        Loan loan = new Loan(); loan.setAccountNumber(accNum); loan.setPrincipal(principal);
        loan.setInterestRate(rate); loan.setTenureMonths(tenure); loan.setEmi(emi);
        return loanRepo.save(loan);
    }
}
