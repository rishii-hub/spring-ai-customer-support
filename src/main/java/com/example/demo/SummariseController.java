package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SummariseController {

    @Autowired
    private SummariseService summariseService;

    @PostMapping("/chat")
    public String chat(@RequestBody String message){

        return summariseService.chat(message);
    }
}
