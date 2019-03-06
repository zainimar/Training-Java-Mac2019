<%-- 
    Document   : arithmetic
    Created on : Mar 6, 2019, 2:51:16 PM
    Author     : Pengguna PC 10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Expression Language (EL)</h1>
        2 + 2 = ${2+2}
        <hr>
        <h3>SCRIPTLET (semua code java bole taip dlm ni)termasuk method ade tanda ! </h3>
        <% 
            String name = "Zainimar Zulkifli";
            out.println(name);
            out.println(cetak(5));
            
        %>
        <hr>
        <h3>Boleh buat function / method java dalam ni kena ade tanda ! </h3>
        <%!
            public String cetak (int bil){
                String str = "";
                for(int i=0; i<bil; i++) {
                    str += i + "--";
                }
                return str;
            }
        %>
        <hr>
        <h3>JSP EXPRESSION (always for print dalam 1 line tanda =) </h3>
        Tarikh hari ini ialah <%= new java.util.Date() %>
        <hr>
        <h3>JSP DIRECTION (tanda @) </h3>
        <%@include file="form.html" %>
    </body>
</html>
