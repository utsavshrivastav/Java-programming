import java.util.Scanner;
public class Reverse
{
  int no,r,sum=0;
  Scanner ip=new Scanner(System.in);
  void set()
   {
     System.out.println("Enter the no");
     no=ip.nextInt();
     
   }
   void cal()
    {
      while(no>0)
       {
        r=no%10;
        sum=sum*10+r;
        no=no/10;
       }
       System.out.println("reverse no="+sum);
    }
    public static void main(String arg[])
     {
      Reverse ob=new Reverse();
      ob.set();
      ob.cal();
     }
}

