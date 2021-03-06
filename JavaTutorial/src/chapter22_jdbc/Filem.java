package chapter22_jdbc;

//untuk import klik kanan di dalam class yang di cipta 
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Filem {
      
    protected void list(){
        
        //guna 3 class ni utk connect ke database
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        
        //list all filem title and description
        //pengurusan error (try..catch = exception/err handling)
        //code berlaku dlam try, catch bila berlaku error 
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/sakila?useLegacyDatetimeCode=false&serverTimezone=America/New_York", "root","");
            stmt = conn.createStatement();
            String sql = "Select * From Film";
            rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                int id = rs.getInt("film_id");
                System.out.print(id + "\t");
                System.out.print(rs.getString("title") + "\t\t");
                System.out.println(rs.getString("description"));
            }
        } 
        catch(Exception e) {
            System.out.println("Berlaku Error");
            System.out.println(e.getMessage());
        }
        
        
    }
    public static void main(String[] args) {
        Filem f = new Filem();
        f.list();
    }
    
    //kalau nk buat table
    //https://www.thoughtco.com/a-simple-table-example-java-code-program-2033892
}
