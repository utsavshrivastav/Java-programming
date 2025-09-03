import java.util.Scanner;

public class LeapYearCalculator {

    Scanner ip = new Scanner(System.in);  
    int year;                             
    boolean isLeap;                        

    
    void setYear() {
        System.out.print("Enter a year: ");
        year = ip.nextInt();
    }

    
    void checkLeapYear() {
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            isLeap = true;
        } else {
            isLeap = false;
        }
    }

    
    void displayResult() {
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static void main(String[] args) {
        LeapYearCalculator obj = new LeapYearCalculator();

        obj.setYear();         
        obj.checkLeapYear();   
        obj.displayResult();   
    }
}

