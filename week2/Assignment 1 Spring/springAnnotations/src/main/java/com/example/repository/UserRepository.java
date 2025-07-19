package com.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public String getUserNameById(int id) {
        return "user" + id;
    }
}

