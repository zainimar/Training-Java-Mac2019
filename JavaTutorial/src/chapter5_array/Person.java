package chapter5_array;
//class members ada 2 shj 1.property dan 2.method
public class Person {
    
    //property @ variable person
    public String name;
    public int age;
    public String gender;
    private String statusKahwin;
    
    //method person
    public void walk(){
        
    }
    
    public void talk(){
        
    }
    
    public void sing(){
        
    }
    
    //encapsulation - tidak boleh direct access..mesti lalau public interface
    public String getStatusKahwin(String jenisOrang){
        if (jenisOrang.equals("kanak-kanak")){
            return "Muda lagi";
        } 
        else if (jenisOrang.equals("tansri")){
            return "Janda";
        } 
        else
        {
            return "Bujang";
        }
//        return this.statusKahwin;
    }
    
}
