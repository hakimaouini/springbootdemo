package com.hakim.springdemo.student;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class inMemoryStudentService implements StudentService{

    private final inMemoryStudentDao dao;

    public inMemoryStudentService(inMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student save(Student s) {
        return this.dao.save(s);
    }

    @Override
    public List<Student> findAllStudent() {

            return dao.findAllStudent();
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }

    @Override
    public void delete(String email) {
    dao.delete(email);
    }

}



