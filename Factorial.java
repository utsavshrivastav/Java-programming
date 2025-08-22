/*import java.util.Scanner;

public class Factorial {
    int n , i ;
     int fact = 1;
    Scanner ip = new Scanner(System.in);

    void set(){
        System.out.println("Enter the no to find its factorial ");
        n = ip.nextInt();
    }

    void cal(){
        for(i = 1;i<=n; i++){
            fact = fact*i;
        }
        System.out.println(" The Factorial " +n+ " will be : "+fact);
    }
    public static void main(String arg[]){
        Factorial ob = new Factorial();
        ob.set();
        ob.cal();
    }
}*/

//  ChatGpt Program

import java.util.Scanner;

public class Factorial {
    int n;
    long fact = 1;
    Scanner sc = new Scanner(System.in);

    void set() {
        System.out.print("Enter a number: ");
        n = sc.nextInt();
    }

    void calculate() {
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }

    public static void main(String[] args) {
        Factorial ob = new Factorial();
        ob.set();
        ob.calculate();
    }
}

