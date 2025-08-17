import java.util.Scanner;

public class Temperature {
    
    double c;
    Double f;
    Scanner ip = new Scanner(System.in);

    void set(){
        System.out.println("Enter temperature in Celsius ");
        c = ip.nextDouble();

       }

    void CelintoFahren(){
        f = (c * 5/9) + 2;
        System.out.println("Temperature = "+f+ " °F ");

    }

    void set1(){
          System.out.println("Enter temperature in Farenheit");
        f = ip.nextDouble();
    }

    void FahrenintoCel(){
        c = (f - 32) * 5/9;
        System.out.println("Temperature = "+c+ " °C ");
        
    }
    
    public static void main(String arg[]){
        Temperature ob = new Temperature();
        ob.set();
        ob.CelintoFahren();
        
        ob.set1();
        ob.FahrenintoCel();
        
    }
}
