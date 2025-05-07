package com.banksphereom.controller;

import com.banksphereom.model.UserEntity;
import com.banksphereom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired private UserRepository repo;

    @PostMapping("/login")
    public UserEntity login(@RequestBody UserEntity creds) {
        return repo.findByUsernameAndPassword(creds.getUsername(), creds.getPassword());
    }
}
