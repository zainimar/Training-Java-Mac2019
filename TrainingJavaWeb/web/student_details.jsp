<%-- 
    Document   : student_details
    Created on : Mar 6, 2019, 3:44:36 PM
    Author     : Pengguna PC 10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.StudentModel"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page View Student (Guna JSP)</title>
    </head>
    <body>
        <% 
        StudentModel stud = (StudentModel) request.getAttribute("stud");
        out.print(stud.name);
        out.print("<br>");
        out.print(stud.id);
        %>
        <h1>Student Details</h1>
        Nama : <% out.print(stud.name); %>
        <br>
        ID : <% out.print(stud.id); %>
       
    </body>
</html>
