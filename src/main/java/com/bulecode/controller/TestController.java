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
        return a + "";
    }



    @RequestMapping
    public String test5(String a) {
        return a + 5;
    }

}
