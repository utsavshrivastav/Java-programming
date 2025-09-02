
import java.util.Scanner;

public class UserInputDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Integer input
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        // Double input
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();

        // Consume leftover newline
        scanner.nextLine();

        // String input
        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();

        // Boolean input
        System.out.print("Enter true or false: ");
        boolean booleanValue = scanner.nextBoolean();

        // Display the entered values
        System.out.println("\nYou entered:");
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("String: " + stringValue);
        System.out.println("Boolean: " + booleanValue);

        scanner.close();
    }
}
