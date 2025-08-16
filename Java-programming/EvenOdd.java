import java.util.Scanner;

public class EvenOdd {
    int a ;
    Scanner ip = new Scanner(System.in);
    void set(){
          System.out.println("Enter the any value of a");
              a = ip.nextInt();
            
        }

    void cal(){
        if(a%2 == 0){
            System.out.println("The mentained no is Even");
            
        }

        else{
            System.out.println("The mentained no is Odd");
        }
    } 
    public static void main(String[] args) {
        EvenOdd ob = new EvenOdd();
        ob.set();
        ob.cal();
    }   
}
