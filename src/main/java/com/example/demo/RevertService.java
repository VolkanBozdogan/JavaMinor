package com.example.demo;
import org.springframework.stereotype.Service;

@Service
public class RevertService {
    public String RevertString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
