package com.example.demo.controller.SendMail;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Page {
    @GetMapping("/ContactForm")
    String index(Model model) {
        return "Mail/SendMail";
    }
}