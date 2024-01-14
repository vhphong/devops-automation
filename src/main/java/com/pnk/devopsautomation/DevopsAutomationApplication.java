package com.pnk.devopsautomation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DevopsAutomationApplication {

//    @GetMapping
//    public static String message() {
//        return "Welcome to Devops Automation Application";
//    }


    public static void main(String[] args) {
        SpringApplication.run(DevopsAutomationApplication.class, args);
    }

}
