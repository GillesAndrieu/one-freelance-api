package com.freelance.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.freelance.business",
        "com.freelance.persistence",
        "com.freelance.model",
        "com.freelance.api"}, exclude = {SecurityAutoConfiguration.class})
@EntityScan("com.freelance.persistence")
@EnableJpaRepositories({"com.freelance.persistence", "com.freelance.model"})
public class Api {

  public static void main(String[] args) {
    SpringApplication.run(Api.class, args);
  }

}
