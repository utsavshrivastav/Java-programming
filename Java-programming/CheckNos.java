
//wrong code
import java.util.Scanner;

public class CheckNos {

 int no;
 Scanner ip;

 public CheckNos() //constructor
  {
   ip=new Scanner(System.in);
  }


  void set()
   {
     System.out.println("Enter the no");
     no=ip.nextInt();
   }


     void check(int no)
   {
     if(no%2==0)
      {
        System.out.println("Even no");
      }
      else
      {
       System.out.println("odd  no");
      }
     
   }

   public static void main(String arg[])
    {
      CheckNos obj=new CheckNos();
      obj.set();    
    }
}