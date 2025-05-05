package com.example.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// the @Component annotation is used to indicate that this class is a Spring component
// thus, it tells the Spring framework to create an instance of this class and manage it as a bean
@Component  
public class Alien {
    // wiring the code
    // we can use @Autowired annotation to inject the Laptop bean into the Alien class
    @Autowired
    Laptop laptop;

    public void code() {
        // if Alien is dependent on other classes, we can use @Autowired annotation to inject them
        laptop.compile();
        // System.out.println("Coding");
    }
}
