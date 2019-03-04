
public class App {
   
    //entry point method -pintu masuk shj utk run first nnt. bagus cuma ada 1 shj pintu masuk
    //main() hanya akan berada satu class kursus yang akan guna class2 lain cth berada didalam pintu masuk
    public static void main(String[] args) {
        //create object
        Car ferrari = new Car();
        ferrari.numberOfDoors = 2;
        ferrari.color = "red"; //mesti dlm "" xbole ''
        //'' hanya untuk char shj
        ferrari.print();
        ferrari.startEngine();
        
        Car porche = new Car();
    }
}
