import java.util.Scanner;

public class SimpleIntrest {
    double p , r , t;
    double si , a , ci ;
    Scanner ip = new Scanner(System.in);

    void set(){
        System.out.println("Enter the valeue of p , r , t");
        p = ip. nextDouble();
        t = ip.nextDouble();
        r = ip.nextDouble();
    }   


    void cal(){
       si = p*r*t/100;

       System.out.println("Simple intrest(si) = "+si);
    }

    void show(){
         a = p * Math.pow((1 + r / 100), t);
         ci = a - p;

         System.out.println("Compound(ci) = "+ci);
         System.out.println("Amount(a) = "+a);

    }

    public static void main(String arg[]){
        SimpleIntrest ob = new SimpleIntrest();
        ob.set();
        ob.cal();
        ob.show();
    }
  
    
}
