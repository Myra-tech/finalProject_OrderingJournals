package com.java_24_25.finalProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorDisplay {

    @GetMapping("/error")
    public String showErrorPage() {
        return "error";
    }
}
