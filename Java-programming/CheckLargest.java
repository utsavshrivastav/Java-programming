import java.util.Scanner;

public class CheckLargest {
    int a , b ;
    Scanner ip = new Scanner(System.in);

    void set(){
        System.out.println("Enter any two nos ");
        a = ip.nextInt();
        b = ip. nextInt();
    }

    void cal(){
        if (a > b ){
            System.out.println("A is largest");}
            else if(b > a){
              System.out.println("B is largest");
            }
            else{
                System.out.println("Both numbers are equal");
            }
        }

        public static void main(String arg[]){
            CheckLargest ob = new CheckLargest();
            ob.set();
            ob.cal();
    

        }
    }
    

