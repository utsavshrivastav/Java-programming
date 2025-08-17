// Swapping of two number without using any 3rd variable
import java.util.Scanner;

public class SwapingWithoutVariable {

    int a , b ;
    Scanner ip = new Scanner(System.in);

    void set()
    {
        System.out.println("Enter your respective numbers");
        a = ip.nextInt();
        b = ip.nextInt();

        System.out.println("Nos Before Swapping a = " +a+ " , b = "+b);

    }

    void cal()
    {
        a = a + b;  
        b = a - b;  
        a = a - b;

        System.out.println("Nos After Swapping a = " +a+ " , b = "+b);
    }
     public static void main(String arg[]){
        SwapingWithoutVariable ip = new SwapingWithoutVariable();
        ip.set();
        ip.cal();
     }
    }
