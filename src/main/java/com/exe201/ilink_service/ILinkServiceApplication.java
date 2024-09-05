package com.exe201.ilink_service;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "com.exe201.ilink_model.model")
@ComponentScan(basePackages = {"com.exe201.ilink_model"})
public class ILinkServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ILinkServiceApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
