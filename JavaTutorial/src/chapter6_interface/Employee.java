package chapter6_interface;

//apabila guna "interface" perkataan yg digunakan adalah "implements"
public class Employee implements Payable{
    
    @Override
    //kena ade method yg sama seperti didalam interface payable kalau ade 2 kena letak 2
    public boolean increasePay(int percent){
        return true;
    }
    
    @Override
    public void cetak(){
        
    }
}
