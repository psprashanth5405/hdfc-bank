package com.hdfc.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HdfcBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(HdfcBankApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "HDFC Bank - Application is Running";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}
