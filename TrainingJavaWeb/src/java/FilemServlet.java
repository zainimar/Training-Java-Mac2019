import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

@WebServlet(urlPatterns = {"/filem"})
public class FilemServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //connect to MySQL database
        //guna 3 class ni utk connect ke database
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        PrintWriter out = response.getWriter();
        
        //list all filem title and description
        //pengurusan error (try..catch = exception/err handling)
        //code berlaku dlam try, catch bila berlaku error 
        try {
            //load driver
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila", "root","");
            stmt = conn.createStatement();
            String sql = "Select * From Film";
            rs = stmt.executeQuery(sql);
            out.print("<table border='1'>");
            out.print("<tr>");
            out.print("<td>ID</td>");
            out.print("<td>Title</td>");
            out.print("<td>Description</td>");
            out.print("</tr>");
            
            while(rs.next()){
                int id = rs.getInt("film_id");
                out.print("<tr>");
                out.print("<td>" + id + "</td>");
                out.print("<td>" + rs.getString("title") + "</td>");
                out.print("<td>" + rs.getString("description")+ "</td>");
                out.println("</tr>");
            }
            out.print("</table>");
        } 
        catch(Exception e) {
            System.out.println("Maaf Terdapat Masalah Teknikal");
            System.out.println(e.getMessage());
        }
       
        
        //Query
        
        //Display Result
        
    }

    

}
