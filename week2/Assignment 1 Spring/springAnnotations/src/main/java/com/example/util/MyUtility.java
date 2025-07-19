package com.example.util;

import org.springframework.stereotype.Component;

@Component
public class MyUtility {
    public String format(String name) {
        return name.toUpperCase();
    }
}
