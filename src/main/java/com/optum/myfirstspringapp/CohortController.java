package com.optum.myfirstspringapp;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CohortController {

    @GetMapping("/cohort/java")
    public String greeting(@RequestParam(name = "topic", required = false, defaultValue = "Spring") String topic,
                           @RequestParam(name = "week", required = false, defaultValue = "week") String week,
                           Model model) {
        model.addAttribute("topic", topic);
        model.addAttribute("week", week);
        return "Cohort";
    }
}