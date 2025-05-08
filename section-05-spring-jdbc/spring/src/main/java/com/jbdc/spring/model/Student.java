package com.jbdc.spring.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * Spring bean scope is a way to define the lifecycle of a bean in the Spring container.
 * It determines how many instances of a bean will be created and how they will be managed.
 * The default scope is singleton, which means that only one instance of the bean will be 
 * created and shared across the entire application.
 * When a bean is defined with scope="prototype", a new instance of the bean is created 
 * every time it is requested from the Spring container.
 */
@Component
@Scope("prototype")
public class Student {
    private int rollNo;
    private String name;
    private int marks;

// getters and setters
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
    }

    
}
