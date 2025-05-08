package com.jbdc.spring;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jbdc.spring.model.Student;
import com.jbdc.spring.service.StudentService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		// service layer
		Student s = context.getBean(Student.class);
		s.setRollNo(101);
		s.setName("Kendrick");
		s.setMarks(95);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students = service.getAllStudents();
		System.out.println("Students: " + students);
	}

}
