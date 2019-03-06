<%-- 
    Document   : decision
    Created on : Mar 6, 2019, 3:24:00 PM
    Author     : Pengguna PC 10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! int day = 3; %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IF...ELSE Example</title>
    </head>
    <body>
        <h1>Decision Making Statement Example</h1>
        <hr>
        <h3>If..Else Example</h3>
        <% if (day ==1 | day == 7){%>
        <p>Today is Weekend</p>
        <% } else {%>
        <p>Today is Not Weekend</p>
        <% } %>

    </body>
</html>
