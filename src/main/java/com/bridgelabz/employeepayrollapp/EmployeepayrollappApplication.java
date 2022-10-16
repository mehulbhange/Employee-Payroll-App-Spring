package com.bridgelabz.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class EmployeepayrollappApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EmployeepayrollappApplication.class, args);
        log.info("Employee payroll App Started");
        log.info("Employee payroll App Started in "+ context.getEnvironment().getProperty("environment")+" Environment");
    }
}
