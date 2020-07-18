package com.hust.be.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * Created by mzYan on 2020-07-18 10:50
 */
@Controller
public class TestController {

    @GetMapping("/index")
    public String index(){
        System.out.println("index page enter");
        return "index";
    }
}
