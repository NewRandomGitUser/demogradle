package com.example.demo.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello World 2 from intelij 2 !";
    }

}
