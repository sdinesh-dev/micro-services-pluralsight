package com.dinesh.microservicesInitial.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/api/greeting")
    public String greeting(){
        return "Hello";
    }
}
