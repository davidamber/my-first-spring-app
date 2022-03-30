
package com.optum.myfirstspringapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingClass2 {

    @GetMapping("/greeting2")
    public String greetingForm(Model model) {
        model.addAttribute("greeting2", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting2")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting2", greeting);
        return "result";
    }

}