import java.util.Scanner;

public class CheckLargestOfThreeNos {

    int a , b , c ; 
    Scanner ip = new Scanner(System.in);
     
    void set(){
        System.out.println("Enter Three nos as per your need ");
        a = ip.nextInt();
        b = ip.nextInt();
        c = ip.nextInt();
    }
    
    void cal(){
        if(a >= b && a >= c)
        {
            System.out.println("A is the largest no");
        }

            else if(b>=a && b>=c)
            {
             System.out.println("B is the largest");

            }
            else
            {
                System.out.println("C is the largest");
            }
        }   
        public static void main(String arg[]){
            CheckLargestOfThreeNos ob = new CheckLargestOfThreeNos();
            ob.set();
            ob.cal();
        }


    }
    
    

