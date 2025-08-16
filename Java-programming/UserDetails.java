import java.util.Scanner;

public class UserDetails {
    String a;
    String b;
    int c;
    Scanner ip = new Scanner(System.in);

    void user(){
        System.out.println("Please Enter Your Good Name");
        a = ip.nextLine();

        System.out.println("Enter Your City");
        b = ip.nextLine();

        System.out.println("Also Enter Your Respective Age");
        c = ip.nextInt();
    }

    void show(){
        System.out.println("Your Good Name is = "+a);
        System.out.println("Your City is = "+b);
        System.out.println("And Your Age is = "+c);
    }

  public static void main(String arg[]){
    UserDetails ob = new UserDetails();
    ob.user();
    ob.show();
  }     
}
