<!-- indicates there may be some java code, run them -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <!-- SOLUTION 1: session from servlet -->
        <h2>Result is : <%= session.getAttribute("result") %></h2>
        <!-- SOLUTION 2: JSP standard library -->
        <h2>Result is : ${result}</h2>
    </body>
</html>
