package com.hakim.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        String firstname;
        return List.of(
                new Student(
                        "hakim",
                        "aouinni",
                        LocalDate.now(),
                        "aouinihakim@gmail.com",
                        34

                ),
                new Student(
                        "nejib 5",
                        "aouinni",
                        LocalDate.now(),
                        "aouininejib@gmail.com",
                        40

                )

        );
    }
}
