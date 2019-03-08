
<%@page import="models.Login_model"%>
<%
if (session.getAttribute("loggedin") == null){
    response.sendRedirect("/ManagementSystem/public/login.jsp");
    return;
}
//casting
Login_model user = (Login_model)session.getAttribute("user");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="/ManagementSystem/assets/bootstrap/css/bootstrap.css">
        <title>MANAGEMENT SYSTEM</title>
    </head>
    <body>
        <h5>Header edit here..</h5>
        <hr>
        <div align="right">
            <h6>Welcome <%= user.getName() %></h6> (<a href="/ManagementSystem/login?logout"> Log Out</a>)
        </div>
        <hr>
        


