package com.bulecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: buleCode
 * Date: 2017/10/7
 */
@Controller
public class TestController {

    @RequestMapping
    public String test1(String a) {
        return a + "b";
    }


    @RequestMapping
    public String test3(int a,int b) {
        int i = a + b;
        return Integer.toString(i);
    }


    @RequestMapping
    public String test2(String c) {
        return c + "c";
    }


    @RequestMapping
    public String test5(String a) {
        return a + 5;
    }

}
