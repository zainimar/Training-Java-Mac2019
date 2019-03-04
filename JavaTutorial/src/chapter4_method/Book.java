package chapter4_method;

/* 
discuss on "static" keyword
- apply to variable and method
- shared (dikongsi)
 */
public class Book {
    static int bil = 0; //shared by all obj and own by class (mesti berada dlm class)
    String title;
    
    //constuctor just utk initialize - nilai awalan
    Book(){
        Book.bil = Book.bil + 1;
        System.out.println("Bil Buku = " + Book.bil);
    }
    
    public static void cetak(){
        System.out.println("Jumlah buku = " + Book.bil);
    }
    
    //pintu masuk nak run aplikasi
    //ade perkataan "new" shj jd object
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book.cetak();
    }
}
