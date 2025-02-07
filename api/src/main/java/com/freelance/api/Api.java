package com.freelance.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"com.freelance.security"},
        exclude = { SecurityAutoConfiguration.class})
public class Api {

  public static void main(String[] args) {
    SpringApplication.run(Api.class, args);
  }

}
