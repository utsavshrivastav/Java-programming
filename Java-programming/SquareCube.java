import java.util.Scanner;

public class SquareCube {

    int num , sq , cub ;
    Scanner ip = new Scanner(System.in);

    void set ()
    {
        System.out.println("Enter your respective number");
        num = ip.nextInt();
    }

    void square()
    {

        sq = num * num;
        System.out.println("Square of number = "+sq);
    }


    void cube() 
    {
        cub = num*num*num;
        System.out.println("Cube of number = "+cub);
    }  

    
    public static void main(String arg[]){
        SquareCube ip = new SquareCube();
        ip.set();
        ip.square();
        ip.cube();

    }
}
        

    
    
