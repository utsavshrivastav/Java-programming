import java.util.Scanner;

public class TemperatureConverter {
    int c , f;
    Scanner ip = new Scanner(System.in);

    void set(){
        System.out.println("Enter the Temperature");
        c = ip.nextInt();
        f = ip.nextInt();
    }

    void Celintofeh(){
        f = (c*5/9) + 32;
        System.out.println("C = "+c);
        System.out.println("F = "+f);

    }

    void fehintocel(){
        c = (f - 32) *5/9;
        System.out.println("F = "+f);
        System.out.println("C = "+c);

    }

    void selectOptions(){
        int choice;
        do {
            System.out.println("\n--- Temperature Converter ---");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = ip.nextInt();

            switch (choice) {
                case 1 -> TemperatureConverter.Celintofeh();
                case 2 -> TemperatureConverter.Fehintocel();
                case 3 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 3);
    }
}

