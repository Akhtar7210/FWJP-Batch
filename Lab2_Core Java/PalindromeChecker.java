import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the original number
        int originalNumber = number;
        
        // Variable to store the reversed number
        int reversedNumber = 0;

        // Loop to reverse the digits of the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Check if the original number is equal to the reversed number
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

        scanner.close();
    }
}
