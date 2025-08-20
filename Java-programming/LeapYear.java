import java.util.Scanner;

public class LeapYear {

    int year;
    Scanner ip = new Scanner(System.in);

    void set(){
        System.out.println("Enter Year ");
        year = ip.nextInt();
     }
     
     void cal(){
       if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }
     }

     public static void main(String arg[]){
        LeapYear ob = new LeapYear();
        ob.set();
        ob.cal();     }
}
