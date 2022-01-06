package com.geekbrains.geekstudents.controllers;

import com.geekbrains.geekstudents.entities.Student;
import com.geekbrains.geekstudents.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/shop")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("")
    public String shopPage(Model model) {
        List<Student> allStudents = studentService.getAllProducts();
        model.addAttribute("students", allStudents);
        return "students";
    }
}