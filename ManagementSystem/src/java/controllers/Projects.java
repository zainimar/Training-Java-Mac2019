
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Projects_model;


@WebServlet(name = "Projects", urlPatterns = {"/projects"})
public class Projects extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //jika ada action edit atau delete
        String action = request.getParameter("action");
        if (action != null){
            int id = Integer.parseInt(request.getParameter("id"));
            Projects_model pro = new Projects_model();
            
            if(action.equals("edit")){
                // call function edit dlm model
                pro = pro.getOne(id);
                request.setAttribute("projects", pro); //data yg dapat dipaparkan dalam form
                request.getRequestDispatcher("projects/form.jsp").forward(request, response);
            } 
            else if(action.equals("del")){
                //call function delete dlm model
                pro.delete(id);
            }
        }
        
        //paparan list
        ArrayList list = new Projects_model().getAll();
        request.setAttribute("list", list);
        request.getRequestDispatcher("projects/list_project.jsp").forward(request, response);
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        Projects_model pro = new Projects_model();
        //bila variable private kena buat setter n getter code auto generate right klik
        pro.setTitle(title);
        pro.setDescription(description);
        // untuk panggil function insert dlm model
        pro.insert(); 
        
        //teknik pertama untuk redirect slps proses insert berjaya ada bawa data(cth : id)
        //request.getRequestDispatcher("projects").forward(request, response);
        //teknik ke dua untuk redirect tanpa membawa apa2 data
        response.sendRedirect("projects");
    }

}
