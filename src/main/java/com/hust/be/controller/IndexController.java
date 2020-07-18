package com.hust.be.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by mzYan on 2020-07-18 15:28
 */
@Controller
public class IndexController {

    @GetMapping("/monitor")
    public String toMonitor(){
        System.out.println("page switch to monitor.");
        return "index";
    }

    @GetMapping("/calendar")
    public String toCalendar(){
        System.out.println("page switch to calendar.");
        return "calendar";
    }

    @GetMapping("/info")
    public String toInfo(){
        System.out.println("page switch to info.");
        return "info";
    }
}
