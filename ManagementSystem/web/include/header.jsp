<%-- 
    Document   : header
    Created on : Mar 7, 2019, 10:50:01 AM
    Author     : Pengguna PC 10
--%>
<%
if (session.getAttribute("loggedin") == null){
    response.sendRedirect("/ManagementSystem/public/login.jsp");
}
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


