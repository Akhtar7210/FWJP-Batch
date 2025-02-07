import java.util.Scanner;

public class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = String.valueOf(number).length();

        
        do {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        } while (number != 0);

       
        if (originalNumber == sum) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
