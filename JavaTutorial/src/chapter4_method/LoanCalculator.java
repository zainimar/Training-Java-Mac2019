//shift + alt + f = auto arrange code
package chapter4_method;
/*
"this" - untuk set/get a property or call/run a method (i.e this.jumlah = 100;)
constructor - tidak terlibat dengan return ..tiada void
overloading - nama method sama tetapi parameter berbeza 
overriding - replace method
void - tidak return apa2 didalam function - tiada perkataan return
super() -  call parent punya function
final - method/property tidak boleh overide (boleh di letakkn didalm method dan variable/property)

*/

public class LoanCalculator extends Calculator{
    int jumlah; //variable / property
    final String tajuk = "LOAN CALCULATOR";
    
    //public void info() { } - tidak boleh overide sbb dah final
    
    
    @Override
    //override cetak() dalam parent
    public void cetak(){
        //this.tajuk = "abc"; error sbb dah letak final tak bole tukar
        System.out.println("Cetak Loan Calculator Emas");
    }
    
    //psvm tab utk shortcut
    //ctrl + space = show auto suggestion
    //shift + ctrl + arrowdown = copy kebawah
    //ctrl + e = delete single line
    public static void main(String[] args) {
        LoanCalculator cal = new LoanCalculator();
        cal.cetak();
        
        LoanCalculator cal2 = new LoanCalculator(30);
    }
    
    //constuctor - tiada return ape2 dan nama mesti sama dengan class
    //auto run bila create new object
    //constructor guna biasanya untuk initialize variable
    //mesti public
    public LoanCalculator(){
        super(); // runkan parent punya constructor
        System.out.println("I'm in constructor");
    }
    
    //dalam satu class bole ada multiple constuctor nama yg sama tp ada parameter
    //constructor guna biasanya untuk initialize variable
    public LoanCalculator(int amount){
        this.jumlah = amount; //initialize value awalan
        System.out.println("I'm in constructor 2");
    }
    
    // mesti return integer, klau xnak return letak void
    public int calcLoanPayment(int amount, int numberOfMonths, String state){
        return 0;
    }
    
    //method overloading - satu function nama yg sama tp parameter tak sama
    public int calcLoanPayment(int amount){
        return 0;
    }
}
