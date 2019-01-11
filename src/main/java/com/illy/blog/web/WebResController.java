package com.illy.blog.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebResController {

    @GetMapping("/hello")
    //@ResponseBody를 모든 메소드에서 적용.
    public String hello(){
        return "Hello World";
    }
}
