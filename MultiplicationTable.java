import java.util.Scanner;

public class MultiplicationTable {
    int no , i , n ;
    Scanner ip = new Scanner(System.in);

    void set(){
        System.out.println("Enter the no ");
        no = ip.nextInt();
    }

    void cal(){
        System.out.println("Multiplication of Table " +no);
        
        for(i = 1; i<=10; i++ ){
              n = no*i;
        System.out.println( no+ " x " +i+ " = " +n );
        }
    }

    public static void main(String arg[]){
        MultiplicationTable ob = new MultiplicationTable();
        ob.set();
        ob.cal();
    }
}
