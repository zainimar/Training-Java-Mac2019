
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="/ManagementSystem/assets/bootstrap/css/bootstrap.css">
        <title>Login Management System</title>
    </head>
    <body>
        <%
            String no = request.getParameter("no");
            if (no != null) {
                out.print("<div class='alert alert-danger col-md-5' align='center'>Wrong Staff Id and Password</div>");
            } 
        %>
            
        <div class="col-md-5" style="background-color: #eee;" align="center">
            <form method="post" action="/ManagementSystem/login">
                <div> Staff ID </div>
                <div><input type="text" name="staff_id" class="form-control-sm"> </div>
                <div> Password </div>
                <div><input type="password" name="pwd" class="form-control-sm"> </div>
                <br>
                <div><input type="submit" name="pwd" class="btn btn-primary btn-sm" value="Sign In"> </div>
            </form>
        </div>
    </body>
</html>
