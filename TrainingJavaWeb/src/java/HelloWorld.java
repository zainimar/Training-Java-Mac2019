
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/HelloWorld"})
public class HelloWorld extends HttpServlet {

    private String message;
    
    public void init() throws ServletException{
        //do require initialization
        message =" Assalamualaikum dan Selamat Pagi ";
    }
    
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        //set response default mmg html
        response.setContentType("text/html");
        
        //actual logic here
        PrintWriter out = response.getWriter();
        
        //http://localhost:8080/TrainingJavaWeb/HelloWorld?nama=Zainimar
        String nama = request.getParameter("nama");
        
        //utk paparan di browser web
        out.println("<h1>" + message + nama +"</h1>");
    }
    
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {  
        //set response default mmg html
        response.setContentType("text/html");
        
        //actual logic here
        PrintWriter out = response.getWriter();
        
        //semua data yg di dapat dalam bentuk string kalau nk tukar kpd integer kena tmbah function parseInt
        String nama = request.getParameter("nama");
        int umur = Integer.parseInt(request.getParameter("umur"));
        
        //utk paparan di browser web
        out.println("<h1>" + message + nama + "<br> yang berusia " + umur +" tahun. <br> Masih muda remaja tu..hihi</h1>");
    }

}
