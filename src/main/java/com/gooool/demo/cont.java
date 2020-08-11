package com.gooool.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cont {
    @RequestMapping("/")
    public String sayhi(){
        return"hello";
    }
}
