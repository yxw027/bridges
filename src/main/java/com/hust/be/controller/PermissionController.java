package com.hust.be.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by mzYan on 2020-07-19 00:53
 */
@Controller
public class PermissionController {

    @GetMapping("/permissionlist")
    public String toPermissionList(){
        return "permissionlist";
    }
}
