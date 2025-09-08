import java.util.Scanner;

public class aaaa {
    String name ;
    int age;
    int rollno;
  Scanner ip = new Scanner(System.in);
    void seet(){
        System.out.println("enter the name , age rollno ");
        name =ip .nextLine();
        age = ip.nextInt();
        rollno = ip.nextInt();
    }

    void show(){
        System.out.println("your name = " +name);
        System.out.println("your age = "+age);
        System.out.println("yourollno = "+rollno);
    }

    public static void main(String[] args) {
        aaaa ob = new aaaa();
        ob.seet();
        ob.show();

    }
}

