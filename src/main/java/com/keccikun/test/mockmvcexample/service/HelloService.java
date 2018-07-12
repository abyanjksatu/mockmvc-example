package com.keccikun.test.mockmvcexample.service;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

    public String hello(){
        return "Hello World !";
    }
}
