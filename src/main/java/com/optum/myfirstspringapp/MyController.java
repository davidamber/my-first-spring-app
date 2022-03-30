package com.optum.myfirstspringapp;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping("/index1")
    public String myMethod1() {
        return "index1";
    }

    @GetMapping("/index2")
    public String myMethod2() {
        return "index2";
    }

    @GetMapping("/index3")
    public String myMethod3() {
        return "index3";
    }
}