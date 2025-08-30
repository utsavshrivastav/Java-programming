import java.util.Scanner;

public class Calculator {

    Scanner ip = new Scanner(System.in);

    void calculate() {
        System.out.print("Enter first number: ");
        double a = ip.nextDouble();

        System.out.print("Enter second number: ");
        double b = ip.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = ip.next().charAt(0);

        double result = 0;

        if (op == '+')
            result = a + b;
        else if (op == '-')
            result = a - b;
        else if (op == '*')
            result = a * b;
        else if (op == '/')
            result = a / b;
        else
            System.out.println("Invalid operator!");

        System.out.println("Result = " + result);
    }

    public static void main(String[] args) {
        Calculator ob = new Calculator();
        ob.calculate();
    }
}

