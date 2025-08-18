import java.util.Scanner;

public class FindingAreas {
    double l, b, area, perimeter;
    Scanner ip = new Scanner(System.in);

    void rectangle() {
        System.out.print("Enter length: ");
        l = ip.nextDouble();
        System.out.print("Enter breadth: ");
        b = ip.nextDouble();

        area = l * b;
        perimeter = 2 * (l + b);

        System.out.println("Rectangle Area = " + area);
        System.out.println("Rectangle Perimeter = " + perimeter);
    }

    public static void main(String[] args) {
        FindingAreas ob = new FindingAreas();
        ob.rectangle();
    }
}

