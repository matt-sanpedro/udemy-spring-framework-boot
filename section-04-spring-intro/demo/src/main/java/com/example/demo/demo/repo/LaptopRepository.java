package com.example.demo.demo.repo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.demo.model.Laptop;

@Repository
public class LaptopRepository {
    public void save(Laptop lap) {
        System.out.println("Saved in Database");
    }
}
