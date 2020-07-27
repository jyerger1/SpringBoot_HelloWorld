package com.tts.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// listens for http requests 
@Controller
public class HelloController {

    // what url leads to what method
    @GetMapping("/hello") // the request will go to localhost:8080/hello as a get request
    // localhost:8080/hello?name=Dolly
    // Dolly will come from parameter
    // Model is like a map / keys and values
    public String sayHello(@RequestParam(required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("user", name);
        return "hello";
        // spring will now look in templates for hello
    }

}