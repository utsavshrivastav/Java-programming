
public class SimpleCalculator {

    
    public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        int result = calc.add(5, 10);
        System.out.println("Result: " + result);
    }
}

