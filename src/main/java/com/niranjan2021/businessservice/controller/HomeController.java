package com.niranjan2021.businessservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class HomeController {


    @GetMapping
    public  String getAppVersion(){
        return  "version-1";

    }
}
