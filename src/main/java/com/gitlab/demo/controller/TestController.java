package com.gitlab.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author litianfu
 * @version 1.0
 * @date 2020/8/17 9:40
 * @email 1035869369@qq.com
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "hello world！ now is:"+ LocalDateTime.now();
    }
}
