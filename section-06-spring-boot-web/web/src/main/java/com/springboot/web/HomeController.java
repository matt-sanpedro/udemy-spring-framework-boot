package com.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("In Home landing /");
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(HttpServletRequest req, HttpSession session) {
        System.out.println("In add");
        int num1 = Integer.parseInt(req.getParameter("FirstNumber"));
        int num2 = Integer.parseInt(req.getParameter("SecondNumber"));
        int result = num1 + num2;
        System.out.println("Result is: " + result);

        // in servlets, the session object can be used to store the result
        session.setAttribute("result", result);
        return "result.jsp";
    }
}
