
package chapter4_method;

public class Calculator {
    //constructor
    // x apply void atau return tetapi method lain kena ade return..kalau xde return mesti public void
    public Calculator() {
        System.out.println("Calculator constuctor by Ima");
    }
    
    //tak boleh overide
    public final void info() {
        
    }
    
    public void cetak(){
        System.out.println("Cetak Loan Calculator silver");
    }
}
