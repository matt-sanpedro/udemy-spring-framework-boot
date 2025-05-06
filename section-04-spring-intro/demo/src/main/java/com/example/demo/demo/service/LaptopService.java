package com.example.demo.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.demo.model.Laptop;

// the @Service annotation is used to indicate that this class is a service component
// the @Service stereotype is a specialization of the @Component annotation
@Service
public class LaptopService {
    public void addLaptop(Laptop lap) {
        System.out.println("Method called: addLaptop");
    }

    public boolean isGoodForProg(Laptop lap) {
        return true;
    }
}
