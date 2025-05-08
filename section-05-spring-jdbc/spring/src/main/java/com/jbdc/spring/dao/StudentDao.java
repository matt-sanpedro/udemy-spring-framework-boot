package com.jbdc.spring.dao;

import org.springframework.stereotype.Repository;
import com.jbdc.spring.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDao {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
        // System.out.println("Student saved: " + s);
        String sql = "insert into student (rollno, name, marks) values (?, ?, ?)";
        int rows = jdbc.update(sql, s.getRollNo(), s.getName(), s.getMarks());
        System.out.println("Rows affected: " + rows);
    }

    public List<Student> findAll() {
        /*
         * In a real application, this would return a list of students from the database
         * 
         * new ArrayList<>() instantiates a new, empty ArrayList object, a dynamic data structure 
         * from Java's Collections Framework. It is used to store a collection of elements, 
         * where the size can grow or shrink dynamically as needed.
         * 
         * The <> syntax signifies a generic type, allowing you to specify the type of objects the 
         * ArrayList will hold. For instance, new ArrayList<String>() creates an ArrayList that 
         * can only store String objects.
         */
        List<Student> students = new ArrayList<>();
        return students;
    }

}
