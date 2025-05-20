package com.example.spring_boot_rest.controller;

import com.example.spring_boot_rest.model.JobPost;
import com.example.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// by default, the @Controller annotation will return a view name - can used @RestController instead
// @Controller
@RestController
public class JobRestController {

    // This class is a placeholder for the JobRestController
    // You can implement the necessary methods and endpoints here
    // For example, you can create endpoints to handle HTTP requests related to job postings

    // Example endpoint method
    // @GetMapping("/jobs")
    // public List<JobPost> getAllJobs() {
    //     return jobService.getAllJobs();
    // }

    // Add more methods as needed for your application
    @Autowired
    private JobService service;

    // must use the @ResponseBody to return data, otherwise a view name is returned by default
    // @ResponseBody
    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

}
