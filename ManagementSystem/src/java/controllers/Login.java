
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Login_model;


@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Login extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String staff_id = request.getParameter("staff_id");
        String pwd =  request.getParameter("pwd");
        
        Login_model user = new Login_model();
        if (user.isExist(staff_id, pwd)){
            //user wujud, set session then go to project list
            HttpSession sess = request.getSession();
            sess.setAttribute("loggedin", true);
            sess.setAttribute("user", user); //simpan maklumat user dlm session cth: nama,role,jawatan
            response.sendRedirect("/ManagementSystem/projects");
            
        } else {
            //user tak wujud , go back to login page
            response.sendRedirect("/ManagementSystem/public/login.jsp?no");
        }
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        session.invalidate();//destroy masa logout
        //untuk destroy session dan redirec
        response.sendRedirect("/ManagementSystem/public/login.jsp");
        
    }

    
}
