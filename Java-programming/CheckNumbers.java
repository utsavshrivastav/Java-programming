import java.util.Scanner;

public class CheckNumbers {
    int no;
    Scanner ip = new Scanner(System.in);

    void set(){
        System.out.println("Enter your respective no for checking ");
        no = ip .nextInt();
    }

    void cal(){
        if(no > 0)
         {
            System.out.println("Your Entered number is postive");
         }
         else if(no < 0)
          {
            System.out.println("Your Entered number is negative");
          }

          if ( no  == 0)
                {
                    System.out.println("Entered no is zero");
                }
    }

    public static void main(String arg[]){
        CheckNumbers ob = new CheckNumbers();
        ob.set();
        ob.cal();
    }
}

