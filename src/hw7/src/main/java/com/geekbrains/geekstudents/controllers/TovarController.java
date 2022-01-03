package com.geekbrains.geekstudents.controllers;


import com.geekbrains.geekstudents.entities.Tovar;

import com.geekbrains.geekstudents.services.TovarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/tovar")
public class TovarController {
    private TovarService tovarService;
    @Autowired
    public void setTovarService(TovarService tovarService) {
        this.tovarService = tovarService;
    }

    @GetMapping("")
    public String shopPage(Model model) {
        List<Tovar> allTovars = tovarService.getAllProducts();
        model.addAttribute("tovars", allTovars);
        return "tovars";
    }

   @RequestMapping(path="/remove/{id}", method= RequestMethod.GET)
    public String removeById(@PathVariable(value = "id") Long tovarId) {
        tovarService.removeById(tovarId);
        return "redirect:/tovar";
    }
}