package com.jbdc.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jbdc.spring.model.Student;
import com.jbdc.spring.dao.StudentDao;

@Service
public class StudentService {

    private StudentDao dao;

    public StudentDao getDao() {
        return dao;
    }

    @Autowired
    public void setDao(StudentDao dao) {
        this.dao = dao;
    }

    public void addStudent(Student s) {
        // System.out.println("Student added: " + s);
        dao.save(s);
    }

    public List<Student> getAllStudents() {
        // In a real application, this would return a list of students from the database
        return dao.findAll();
    }

}
