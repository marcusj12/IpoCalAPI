package com.careerdevs.IpoCalendarApi.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/ipo")
public class IpoController {


    //What is auto wired? Why are we assigning the env to Environment?
    @Autowired
        private Environment env;


    @GetMapping ("/test")
        private String testRoute () {
            return "testing, request received";
    }
}
//RootRoute: domain w/ the protocol dependant on the server we're interacting with