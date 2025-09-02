import java.util.Scanner;

public class Swap {
    int a , b , temp ; 
    Scanner ip = new Scanner(System.in);

    void set(){
        System.out.println("Enter any two numbers");
        a = ip.nextInt();
        b = ip.nextInt();
    }

    void cal (){
        System.out.println(" Number Before swap a = " +a+ " , b= "+b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("Number After Swap a = " +a+ " , b = " +b);
}

public static void main (String arg[]){
    Swap ob = new Swap();
    ob.set();
    ob.cal();
}
}
