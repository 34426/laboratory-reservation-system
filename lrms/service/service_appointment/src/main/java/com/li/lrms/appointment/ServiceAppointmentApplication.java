package com.li.lrms.appointment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan(basePackages = {"com.li"})
@SpringBootApplication
@EnableScheduling
public class ServiceAppointmentApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAppointmentApplication.class,args);
    }
}
