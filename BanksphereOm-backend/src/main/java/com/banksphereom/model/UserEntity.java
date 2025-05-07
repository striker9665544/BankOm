package com.banksphereom.model;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data  // or @Getter/@Setter
@Table(name="user_entity")
public class UserEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    private String username;
    private String password;
    private String accountNumber;
    
    /** Required by JPA */
    protected UserEntity() { }
    // getters and setters...
    public String getusername() { return username; }
    public void setusername(String username) { this.username = username; }
    public String getpassword() { return password; }
    public void setpassword(String password) { this.password = password; }
    public String getaccountNumber() { return accountNumber; }
    public void setaccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
}
