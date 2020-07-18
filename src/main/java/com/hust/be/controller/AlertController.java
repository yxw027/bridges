package com.hust.be.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by mzYan on 2020-07-19 00:11
 */
@Controller
public class AlertController {

    @GetMapping("/alertlist")
    public String toAlertList(){
        return "alertlist";
    }
}
