
package models;

import java.sql.ResultSet;
import java.sql.Statement;

public class Login_model extends Model{
    
    //return true jika staff id dan password match
    public boolean isExist(String staff_id, String pwd){
        String sql = "SELECT * FROM users "
                     + "WHERE staff_id = '" + staff_id + "' "
                     + "AND pwd = '" + pwd + "'";
        
        try
        {
             Statement stmt = this.getStmt();
             ResultSet rs = stmt.executeQuery(sql);
             
             if(rs.next()){
                return true; //user wujud
             } else {
                 return false; //user tidak wujud
             }
        }
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    //untuk testing running di terminal
    public static void main(String[] args) {
        Login_model model = new Login_model();
        if (model.isExist("11111", "pass")){
            System.out.println("O.K");
        } else {
            System.out.println("K.O");
        }
    }
}

