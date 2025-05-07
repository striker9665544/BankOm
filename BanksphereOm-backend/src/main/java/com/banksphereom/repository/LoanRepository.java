package com.banksphereom.repository;

import com.banksphereom.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findByAccountNumber(String accountNumber);
}
