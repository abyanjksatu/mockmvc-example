package com.keccikun.test.mockmvcexample.controller;

import com.keccikun.test.mockmvcexample.model.Hello;
import com.keccikun.test.mockmvcexample.service.HelloService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public String helloWorld(){
        return helloService.hello();
    }

    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public Hello json(){
        return new Hello("Greetings", "Hello World");
    }

    @PostMapping(value = "/post", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Hello post(@RequestBody Hello hello){
        return hello;
    }

}
