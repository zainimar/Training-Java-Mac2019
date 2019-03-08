
package models;

import java.sql.ResultSet;
import java.sql.Statement;

public class Login_model extends Model{
    private int id;
    private String staff_id;
    private String pwd;
    private String role;
    private String name;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
     public boolean insert(){
        String sql = "INSERT INTO users(name, pwd, role, gender )" +
                     "VALUES('"+ this.name + "','"+ this.pwd +"','"+ this.role +"','"+ this.gender +"')";
        
        try
        {
             Statement stmt = this.getStmt();
             stmt.execute(sql);//insert update delete guna execute
        }
        catch (Exception e) 
        {
            e.printStackTrace(); // print err msg to console
            return false;
        }
        return true;
    }
    
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
                this.id = rs.getInt("id");
                this.pwd = rs.getString("pwd");
                this.staff_id = rs.getString("staff_id");
                this.role = rs.getString("role");
                this.name = rs.getString("name");
                
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

