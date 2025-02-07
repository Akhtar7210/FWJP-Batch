import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

       
        long result = 1;
        int absExponent = Math.abs(exponent);

       
        do {
            result *= base;
            absExponent--;
        } while (absExponent > 0);

       
        if (exponent < 0) {
            System.out.println("Result: " + (1.0 / result));
        } else {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
