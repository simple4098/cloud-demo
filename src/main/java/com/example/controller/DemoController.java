package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p> 描述 </p>
 * @auther simple
 * data 2017/1/9 0009.
 */
@RestController
public class DemoController {
    @RequestMapping("index")
    public String index(){
        return "hello spring cloud";
    }
}
