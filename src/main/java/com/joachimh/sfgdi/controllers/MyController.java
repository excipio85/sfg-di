package com.joachimh.sfgdi.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World!");
        return "Hi Folks!";
    }
}
