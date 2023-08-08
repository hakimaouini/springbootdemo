package com.hakim.springdemo.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
Student findByEmail(String email);
void deleteByEmail(String email);

}
