import java.util.Scanner;

public class AreaOfCircle {
    int  a , r;
     int  l , b; 
Scanner ip = new Scanner(System.in);

  void set(){
    System.out.println("Enter the value of r ");
    r = ip.nextInt();

  }

  void cal(){
    double pi=3.14;
      double a;
      a=pi*r*r;
      System.out.println("Area of circle = "+a);
  }

  void squ(){
    System.out.println("Enter the value of l and b ");
    l = ip.nextInt();
    b = ip.nextInt();
 }

 void squcal(){
    a = l*b;
 System.out.println("Area of Square = "+a);
}

public static void main(String arg[]){
    AreaOfCircle ob = new AreaOfCircle();
    ob.set();
    ob.cal();
    ob.squ();
    ob.squcal();
}

}
