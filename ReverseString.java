
import java.util.Scanner;

public class ReverseString {
    String str;
    Scanner ip = new Scanner(System.in);

    void set() {
        System.out.println("Enter any string you wanted to reverse =");
        str = ip.nextLine();
    }

    void cal() {
        String rev = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed string will be = " + rev);
    }

    public static void main(String[] args) {
        ReverseString ob = new ReverseString();
        ob.set();
        ob.cal();
    }
}
