package com.yzp.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: YZP
 * Date: 2021/9/25
 * Time: 8:35
 */
@RestController
public class hiController {
    @GetMapping("/hi")
    @RequestMapping("/hi")
    public String hi() {
        return "hispringboot";
    }
}
