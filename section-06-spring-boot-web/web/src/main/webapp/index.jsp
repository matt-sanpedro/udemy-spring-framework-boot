<!-- indicates there may be some java code, run them -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <h2>My Life for Hire</h2>
        <form action="add">
            <label for="FirstNumber">First Number:</label><br>
            <input type="number" id="FirstNumber" name="num1" value="11"><br>
            <label for="SecondNumber">Second Number:</label><br>
            <input type="number" id="SecondNumber" name="num2" value="22"><br><br>
            <input type="submit" value="Submit">
        </form> 
    </body>
</html>
