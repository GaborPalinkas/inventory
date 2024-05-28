package com.flamer.inventory.web.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login"; // Assumes the login.html file is named login and placed in src/main/resources/templates
    }
}
