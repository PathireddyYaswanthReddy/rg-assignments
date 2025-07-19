package com.example.service;

import com.example.repository.UserRepository;
import com.example.util.MyUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MyUtility myUtility;

    public String getFormattedUserName(int id) {
        String name = userRepository.getUserNameById(id);
        return myUtility.format(name);
    }
}
