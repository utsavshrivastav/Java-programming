
 import java.util.Scanner;
 public class LeapYears{
    public static void main(String[] args) {
     Scanner ip = new Scanner(System.in);

    System.out.print("Enter a number: ");
        int num = ip.nextInt();

        if (num % 4 == 0) {
            if (num % 100 == 0) {
                if (num % 400 == 0)
                 {
         System.out.println("Leap year");
                 } 

                else 
                {
            System.out.println("Not leap year");
                }
        }        

                      else {
                       System.out.println("Leap year");
                           }
                        } 
                              else {
                                System.out.println("Not leap year");
                                   }
                                   ip.close(); 

                                }}
                                
                            