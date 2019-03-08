
package models;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Projects_model extends Model{
    private int id;
    private String title;
    private String description;
    
    //constructor utk initilize value
    public Projects_model(){
        this.title = "";
        this.description = "";       
    }
   
    public boolean insert(){
        String sql = "INSERT INTO project(title, description)" +
                     "VALUES('"+ this.title + "','"+ this.description +"')";
        
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
    
    public boolean delete(int id){
        String sql = "DELETE FROM project WHERE id="+ id;
        
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
    
    public boolean update(int id){
        String sql = "UPDATE project SET " 
                    + "title = '" + this.title + "', "
                    + "description = '" + this.description +"' "
                    + "WHERE id = "+ id;
        
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
    
    public ArrayList getAll(){
        ArrayList arr = new ArrayList();
        
        //query run di sini
        String sql = "select * from project";
        try
        {
             Statement stmt = this.getStmt();
             ResultSet rs = stmt.executeQuery(sql);
             while(rs.next()){
                 Projects_model pro = new Projects_model();
                 pro.id = rs.getInt("id");
                 pro.title = rs.getString("title");
                 pro.description = rs.getString("description");
                 arr.add(pro);
             }
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return arr;
    }
    
    //return 1 record
    public Projects_model getOne(int id){
        
        //query run di sini
        String sql = "select * from project where id=" + id;
        Projects_model pro = new Projects_model();
        
        try
        {
             Statement stmt = this.getStmt();
             ResultSet rs = stmt.executeQuery(sql);
             while(rs.next()){
                 
                 pro.id = rs.getInt("id");
                 pro.title = rs.getString("title");
                 pro.description = rs.getString("description");
             }
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return pro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    //untuk test run atau x code kite
    public static void main(String[] args) {
        Projects_model p = new Projects_model();
        //utk test get data
        ArrayList list = p.getAll();
        for(int i=0; i<list.size(); i++){
            Projects_model pro = (Projects_model) list.get(i);
            System.out.println(pro.title);
        }
        
        //utk test pos data
        p.setTitle("test");
        p.setDescription("la..lal..aa");
        p.insert();
    }

    public ArrayList search(String title, String desc) {
        ArrayList arr = new ArrayList();
        
        //run query search di sini
        String sql = "select * from project where 1 ";
        
        if (! title.equals("")){
            sql += "AND title LIKE '%" + title + "%' ";
        }
        
        if (! desc.equals("")){
            sql += "AND description LIKE '%" + desc + "%' ";
        }
        try
        {
             Statement stmt = this.getStmt();
             ResultSet rs = stmt.executeQuery(sql);
             while(rs.next()){
                 Projects_model pro = new Projects_model();
                 pro.id = rs.getInt("id");
                 pro.title = rs.getString("title");
                 pro.description = rs.getString("description");
                 arr.add(pro);
             }
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return arr;
        
    }
}
