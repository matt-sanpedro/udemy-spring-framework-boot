package com.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("In Home landing /");
        // JSP: JavaServer Pages, is a technology for creating dynamic weg pages
        return "index";
    }

    // SOLUTION 1: using the session object from HttpSession
    // @RequestMapping("add")
    // public String add(HttpServletRequest req, HttpSession session) {
    //     System.out.println("In add");
    //     int num1 = Integer.parseInt(req.getParameter("num1"));
    //     int num2 = Integer.parseInt(req.getParameter("num2"));
    //     int result = num1 + num2;
    //     System.out.println("Result is: " + result);

    //     // in servlets, the session object can be used to store the result
    //     session.setAttribute("result", result);
    //     return "result.jsp";
    // }

    // SOLUTION 2: using the RequestParam
    @RequestMapping("add")
    public String add(@RequestParam("num1") int firstNumber, @RequestParam("num2") int secondNumber, Model model, HttpSession session) {
        System.out.println("In add");
        int result = firstNumber + secondNumber;
        System.out.println("Result is: " + result);

        // in servlets, the session object can be used to store the result
        session.setAttribute("result", result);
        // MODEL: interface to pass data from controller to view (or JSP in this case)
        model.addAttribute("result", result);
        return "result";
    }
}
