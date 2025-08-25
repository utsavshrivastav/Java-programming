
import java.util.Scanner;
public class BasicSalary {
    
    double bs , gs , ta , da ;
    Scanner ip = new Scanner(System.in);
    
    void set()
    {
        
        System.out.println("Enter base salary(bs)");
        bs = ip.nextDouble();
    }
    void show()
    {
        ta = (bs*10)/100;
        da = (bs*5)/100;
        gs = bs+ta+da;
        System.out.println("gross Salary = "+gs);
    }
    public static void main (String arg[])
    {
        BasicSalary ob = new BasicSalary();
        ob.set();
        ob.show();
  
    }

}
