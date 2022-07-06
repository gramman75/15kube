package com.example.kube.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public String get(){
        String hostName = System.getenv("HOSTNAME");
        return "java server : " + hostName ;
    }
}
