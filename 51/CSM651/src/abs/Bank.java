package abs;

abstract class Banks{    
abstract int getRateOfInterest();    
}    
class SBI extends Banks{    
int getRateOfInterest(){return 7;}    
}    
class PNB extends Banks{    
int getRateOfInterest(){return 8;}    
}    
    
class Bank{    
public static void main(String args[]){    
Banks b;  
b=new SBI();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
b=new PNB();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
}}    