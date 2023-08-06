package com.hakim.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/api/v1/students")
public class studentController {

    private StudentService service ;

    public studentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> findAllStudents(){

        return service.findAllStudents();


    }
}
