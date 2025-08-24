/*import java.util.Scanner;

public class PrimeNos {
    int no;
    Scanner ip = new Scanner(System.in);

    void set()
    {
       System.out.println("Enter any number to Check!");
       no = ip.nextInt();
    }

    void cal(){

    }
}
/*
 if(n<=1) && (n%1==0)and (n%n==0)

 {
 sop(Prime no)
 }
 else {
 sop ("not prime")
 }
 */

 import java.util.Scanner;

public class PrimeCheck {
    int n;
    Scanner sc = new Scanner(System.in);

    void set() {
        System.out.print("Enter a number: ");
        n = sc.nextInt();
    }

    void check() {
        if (n <= 1) {
            System.out.println("Not prime");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println("Prime number");
        else
            System.out.println("Not prime");
    }

    public static void main(String[] args) {
        PrimeCheck ob = new PrimeCheck();
        ob.set();
        ob.check();
    }
}
