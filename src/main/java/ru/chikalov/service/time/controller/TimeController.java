package ru.chikalov.service.time.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/main")
public class TimeController {

    @Value("${eureka.instance.instance-id}")
    private String id;

    @GetMapping("/time")
    public String getTime(){
        return "now time = "+(new Date().toString())+", my port = "+id;
    }
}
