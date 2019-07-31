package com.wjj.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/goods")
public class TestController {
    @RequestMapping("/getString")
    public String getString(){
        return "aaaaaaaaaaaa";
    }
}
