import java.util.Scanner;

public class CalculatorByMethods{

    Scanner ip = new Scanner(System.in);
    double a, b, result;   
    char op;

    
    void setValues() {
        System.out.print("Enter first number: ");
        a = ip.nextDouble();

        System.out.print("Enter second number: ");
        b = ip.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        op = ip.next().charAt(0);
    }

    
    void calculate() {
        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            if (b == 0) {
                System.out.println("Error! Division by zero.");
                return; 
            }
            result = a / b;
        } else {
            System.out.println("Invalid operator!");
            return; 
        }

        System.out.println("Result = " + result);
    }

    public static void main(String[] args) {
        CalculatorByMethods ob = new CalculatorByMethods();
        ob.setValues();  
        ob.calculate();   
    }
}


