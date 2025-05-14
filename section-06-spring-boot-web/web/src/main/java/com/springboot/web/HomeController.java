package com.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("In HomeController");
        return "index.jsp";
    }
}
