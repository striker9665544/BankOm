package com.banksphereom.model;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data  // or @Getter/@Setter
public class Transaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    private String accountNumber;
    private String type;
    private Double amount;
    private LocalDateTime date;
    @PrePersist void prep() { date = LocalDateTime.now(); }
    
    /** Required by JPA */
    protected Transaction() { }
    // getters and setters...
    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public String gettype() { return type; }
    public void settype(String type) { this.type = type; }
    public Double getamount() { return amount; }
    public void setamount(Double amount) { this.amount = amount; }
    @SuppressWarnings("rawtypes")
	public LocalDateTime getdate() { return date; }
    @SuppressWarnings("rawtypes")
	public void setdate(LocalDateTime date) { this.date = date; }
}
