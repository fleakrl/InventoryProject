package com.example.demo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final String template = "Hello %s";

    @RequestMapping
    public HelloREST greeting(@RequestParam(value="name", defaultValue = "") String name){
        return new HelloREST(1,String.format(template, name));

    }

}
