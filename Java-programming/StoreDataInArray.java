import java.util.Scanner;

public class StoreDataInArray {
    int i,n;
    int marks[]= new int[n];
    Scanner ip = new Scanner(System.in);


    void set(){
        System.out.print("Enter number of subjects: ");
         n = ip.nextInt();

     System.out.println("Enter marks of " + n + " subjects:");
        for (int i = 0; i < n; i++) {
            marks[i] = ip.nextInt();
        }
 }

 void cal(){

 }

 public static void main(String arg[]){
    StoreDataInArray ob = new StoreDataInArray();
    ob.set();
    ob.cal();
 }

}
