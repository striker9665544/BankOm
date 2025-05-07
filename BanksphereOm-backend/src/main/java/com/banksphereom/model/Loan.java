package com.banksphereom.model;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data  // or @Getter/@Setter
public class Loan {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    private String accountNumber;
    private Double principal;
    private Double interestRate;
    private Integer tenureMonths;
    private Double emi;
    
    /** Required by JPA */
    protected Loan() { }
    // getters and setters...
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public double getprincipal() { return principal; }
    public void setprincipal(double principal) { this.principal = principal; }
    public double getinterestRate() { return interestRate; }
    public void setinterestRate(double interestRate) { this.interestRate = interestRate; }
    public int gettenureMonths() { return tenureMonths; }
    public void settenureMonths(int tenureMonths) { this.tenureMonths = tenureMonths; }
    public double getemi() { return emi; }
    public void setemi(double emi) { this.emi = emi; }
}
