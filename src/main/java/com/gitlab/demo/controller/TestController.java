package com.gitlab.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * @author litianfu
 * @version 1.0
 * @date 2020/8/17 9:40
 * @email 1035869369@qq.com
 */
@Slf4j
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        log.info("hello world！ now is:"+ LocalDateTime.now());
        return "hello world！ now is sss:"+ LocalDateTime.now(ZoneOffset.ofHours(8));
    }
}
