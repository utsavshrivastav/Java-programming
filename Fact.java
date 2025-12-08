import java.util.Scanner;

public class Fact {
    int no;
    Scanner ip = new Scanner(System.in);

    void set() {
        System.out.println("Enter the number which you want factorial:");
        no = ip.nextInt();
    }

    
    int fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    void cal() {
        int result = fact(no);
        System.out.println("Factorial = " + result);
    }

    public static void main(String[] args) {
        Fact ob = new Fact();
        ob.set();
        ob.cal();
    }
}

