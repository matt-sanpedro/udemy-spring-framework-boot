package com.jbdc.spring.dao;

import org.springframework.stereotype.Repository;
import com.jbdc.spring.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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
        // List<Student> students = new ArrayList<>();
        // return students;
        String sql = "select * from student";

        // // APPROACH 1: Standard application of interface
        // RowMapper<Student> mapper = new RowMapper<Student>() {
        //     @Override
        //     /*
        //      * The mapRow method is called for each row of the ResultSet. It takes the current row
        //      * number and the ResultSet as parameters. The method is responsible for mapping the
        //      * current row of the ResultSet to a new object of type Student.
        //      * 
        //      * In addition, mapRow takes one row at a time
        //      */
        //     public Student mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
        //         Student s = new Student();
        //         s.setRollNo(rs.getInt("rollno"));
        //         s.setName(rs.getString("name"));
        //         s.setMarks(rs.getInt("marks"));
        //         return s;
        //     }
        // };
        // return jdbc.query(sql, mapper);

        // APPROACH 2: Lambda expression
        return jdbc.query(sql, (rs, rowNum) -> {
                Student s = new Student();
                s.setRollNo(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s;
        });

    }
}
