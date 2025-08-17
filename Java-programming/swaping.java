//Swaping of two number using 3rd variable (temp)

import java.util.Scanner;

public class swaping {
    
    int a , b , temp; 
    Scanner ip = new Scanner(System.in);

    void set(){
        System.out.println("Enter yout first number");
        a = ip.nextInt();

        System.out.println("Enter your second number");
        b= ip.nextInt();

        System.out.println("Number Before Swapping: a = "+a+ " , b= " +b);
    }

    void cal()
    {
        temp = a;
        a = b;
        b = temp;
        System.out.println("Number After Swapping: a = "+a+ " , b = " +b);   
        }

        public static void main(String arg[])
        {
            swaping ip = new swaping();
            ip.set();
            ip.cal();

        }
    }
