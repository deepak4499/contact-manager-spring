package com.example.contactmanagerdemo.controllers;

import com.example.contactmanagerdemo.ContactManagerDemoApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("")
    public String getHomePage(Model model) {
        return ContactManagerDemoApplication.indexLayout(model, "dummy");
    }

    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello from deepak");
        return "hello";
    }
}
