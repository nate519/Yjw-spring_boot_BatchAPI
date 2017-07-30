package com.spring_boot_BatchAPI.config;

import com.spring_boot_BatchAPI.component.HelloPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public HelloPrinter helloPrinter() {
        return new HelloPrinter();
    }
}
