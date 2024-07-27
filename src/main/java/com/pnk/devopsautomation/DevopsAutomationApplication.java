package com.pnk.devopsautomation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DevopsAutomationApplication {

    @GetMapping
    @RequestMapping("/devops-automation")
    public static String message() {
        System.out.println("Hello from Devops Automation Application");
        return "Welcome to Devops Automation Application";
    }


    public static void main(String[] args) {
        SpringApplication.run(DevopsAutomationApplication.class, args);
    }

}