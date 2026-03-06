package com.pipeline.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class JenkinsController {

    @GetMapping("welcome")
    public String welcome(){
        return "Welcome";
    }

    @GetMapping("hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("hi")
    public String hi(){
        return "Hi";
    }
    // added comment for maven
    // added commit for jenkins
}
