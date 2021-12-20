package com.geekbrains.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomeController {

//    @RequestMapping(value = "/start/{name}", method = RequestMethod.GET)
//    public String hello(Model model, @PathVariable(value = "name")String name) {
//        model.addAttribute("name", name);
//        return "index";
//    }

    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public String hello(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        return "index";
    }
}