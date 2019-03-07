package models;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Model {
    public Statement getStmt(){
        
        Connection conn=null;
        Statement stmt=null;
        
        try {
            //load driver
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/pms", "root","");
            stmt = conn.createStatement();
        } 
        catch(Exception e) {
            System.out.println("Maaf Terdapat Masalah Teknikal");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return stmt;
       
    }
}
