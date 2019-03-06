
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/student"})
public class StudentController extends HttpServlet {

        
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        //set response default mmg html
        response.setContentType("text/html");
        
        //actual logic here
        PrintWriter out = response.getWriter();
        String nama = request.getParameter("nama");
        request.setAttribute("name", nama);
        //utk paparan di browser web( controller servlet comunicate dengan veiw -jsp)
        RequestDispatcher dispatch = request.getRequestDispatcher("student_details.jsp");
        dispatch.forward(request, response);
    }
    
    

}
