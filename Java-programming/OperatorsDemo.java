 
public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println();

        
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println();

        
        boolean x = true;
        boolean y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y)); 
        System.out.println("x || y: " + (x || y)); 
        System.out.println("!x: " + (!x));         
        System.out.println();

        
        int p = 6; 
        int q = 3; 
        System.out.println("Bitwise Operators:");
        System.out.println("p & q = " + (p & q));   
        System.out.println("p | q = " + (p | q));  
        System.out.println("p ^ q = " + (p ^ q));   
        System.out.println("~p = " + (~p));         
        System.out.println("p << 1 = " + (p << 1)); 
        System.out.println("p >> 1 = " + (p >> 1)); 
    }
}

