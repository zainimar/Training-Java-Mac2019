
package chapter4_method;
//pass variable by val vs by reference cth mesin photostat
//primitive + String = parsing by value - photostat
//object always passing by reference - ubah direct kat kertas ori

//class
public class Student {
    
    //method
    public void setNama(String name){
        name = "Nama saya " + name + " binti Zulkifli";
        System.out.println(name);
    }
    
    //method
    public void changeBookTitle(Book b){
        b.title = "Java Advance";
    }
    
    //main - entry point utk run aplikasi
    public static void main(String[] args) {
        
        //passing variable by value - yang original tak berubah
        Student s1 = new Student();
        String nama = "Zainimar";
        s1.setNama(nama);
        System.out.println(nama);
        
        //passing by reference - yang original akan berubah
        Book b1 = new Book();
        b1.title = "Java for Beginner";
        System.out.println(b1.title);
        //dimanipulasi oleh object yg lain automatik original berubah cth: student(s1) ubah tajuk buku(b1)
        s1.changeBookTitle(b1);
        System.out.println(b1.title);
    }
}
