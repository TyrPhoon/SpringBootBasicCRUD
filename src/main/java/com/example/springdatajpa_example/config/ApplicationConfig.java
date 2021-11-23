package com.example.springdatajpa_example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.example.springdatajpa_example.repository")
public class ApplicationConfig {
}
