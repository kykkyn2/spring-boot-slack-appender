package com.qkrwjdgus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    @GetMapping("/")
    public void hello2() {

        System.out.println("=====");
        System.out.println("^^^^^");
        System.out.println("=====");

    }

    @PostMapping("/")
    public void hello(@RequestBody String json) {

        System.out.println("=====");
        System.out.println(json);
        System.out.println("=====");

    }

}
