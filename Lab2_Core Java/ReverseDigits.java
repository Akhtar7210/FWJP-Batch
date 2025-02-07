import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Variable to store the reversed number
        int reversedNumber = 0;

        // Loop to reverse the digits of the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Output the reversed number
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }
}
