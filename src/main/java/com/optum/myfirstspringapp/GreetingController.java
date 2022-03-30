package com.optum.myfirstspringapp;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Amber") String name,
                           @RequestParam(name="age", required=false, defaultValue="27") String age,
                           Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "Greeting";
    }
    @GetMapping("/goodbye")
    public String goodbye(@RequestParam(name="firstname", required = false, defaultValue = "Amber") String firstname, Model model) {
        model.addAttribute("firstname", firstname);
        return "Goodbye";
    }
}