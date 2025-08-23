
import java.util.Scanner;


 public class SimpleIntrest
 {
   double p,r,t,si;
   Scanner ip=new Scanner(System.in);

   void set()
    {
       System.out.println("Enter the value of p,r,t");
      p=ip.nextDouble(); 
      r=ip.nextDouble();
      t=ip.nextDouble();
    }

    void cal()
     {
       si=(p*r*t)/100;
       System.out.println("simple interest="+si);
     }
     
  public static void main(String arg[])
   {
     SimpleIntrest ob=new SimpleIntrest();
     ob.set();
     ob.cal(); 
            
   }   
 }

