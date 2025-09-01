
public class AreasUsingPassingParameter
{
  double a,r,pi;
  int s;
  public AreasUsingPassingParameter()
   {
     pi=3.14;
   }
   void area(double r)
    {
     a=pi*r*r;
     System.out.println("area of circle="+a);
    }
    void area(int s)
     {
       a=s*s;
       System.out.println("area of square="+a); 
     }
     public static void main(String arg[])
      {
       AreasUsingPassingParameter ob=new AreasUsingPassingParameter();
       ob.area(5);
       ob.area(3.0);
      }
    }

