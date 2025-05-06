package com.example.demo.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// the @Component annotation is used to indicate that this class is a Spring component
// thus, it tells the Spring framework to create an instance of this class and manage it as a bean
@Component  
public class Alien {

    @Value("25")
    private int age;

    // the @Autowired annotation is used to indicate that this field should be automatically injected with a bean of the same type
    // wiring the code
    // we can use @Autowired annotation to inject the Laptop bean into the Alien class
    // @Autowired
    // private Laptop laptop;
    private Computer com;
 
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    /*
     * Setter Injection:
        This is an example of setter-based dependency injection. 
        Instead of injecting the dependency through the constructor or directly into the field, 
        Spring calls this setter method to provide the required dependency. 
        Setter injection is particularly useful when the dependency is __optional__ or 
        when you want to __change__ the dependency after the object is created.
     */
    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        // if Alien is dependent on other classes, we can use @Autowired annotation to inject them
        com.compile();
        // System.out.println("Coding");
    }
}
