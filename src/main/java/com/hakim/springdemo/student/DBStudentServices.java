package com.hakim.springdemo.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBStudentServices implements StudentService{
    private final StudentRepository repository;

    public DBStudentServices(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student save(Student s) {
        return repository.save(s);
    }

    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return repository.save(s);
    }

    @Override
    public void delete(String email) {
    repository.deleteByEmail(email);

    }
}
