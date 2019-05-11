package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author tangjihede
 * @classname TestController
 * @date 2019-04-30 19:55
 * /
 **/
@RestController
@RequestMapping(value = "/dq")
public class TestController {

    @RequestMapping(value = "/rocket", method = RequestMethod.GET)
    public String getCityPair() {
        return "hello world !";
    }
}
