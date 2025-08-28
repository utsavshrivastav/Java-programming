import java.util.Scanner;
public class FactorialOfNumber {
        int n ,  fact = 1 , i;
        Scanner ip  = new Scanner(System.in);  
        
        void set(){
             System.out.println("Enter a number: ");
             n = ip .nextInt();
        }

        void cal(){
         fact = 1;   // factorial result
         i = 1;      // counter variable

        while (i <= n) {
            fact = fact * i;  // multiply
            i++;              // increment
        }

        System.out.println("Factorial of " + n + " is: " + fact);
    }
    public static void main(String[] args) {
       FactorialOfNumber ob = new FactorialOfNumber();
       ob.set();
       ob.cal();
    }
}


        