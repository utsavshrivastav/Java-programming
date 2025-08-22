import java.util.Scanner;

public class NaturalNosSum {
    int n , i , sum = 0;
    Scanner ip = new Scanner(System.in);

    void set(){
        System.out.println("Enter thr number ");
        n = ip.nextInt();
    }

    void cal(){
        for(i=1;i<=n;i++){
            sum = sum+i;
            }
        System.out.println("The sum of first N-natural no = "+sum);
    }
    public static void main(String arg[]){
        NaturalNosSum ob = new NaturalNosSum();
    ob.set();
ob.cal();
    }
}
