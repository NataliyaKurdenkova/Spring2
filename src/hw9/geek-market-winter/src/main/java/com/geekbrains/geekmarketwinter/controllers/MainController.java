package com.geekbrains.geekmarketwinter.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MainController {
    @RequestMapping("/")
    public String showHomePage(HttpServletRequest request, HttpServletResponse response) {
        return "index";
    }

    //защита на уровне методов
    @Secured("ROLE_ADMIN")
    @RequestMapping("/onlyYou")
    public String showHomePage() {
        return "onlyYou";
    }
}
