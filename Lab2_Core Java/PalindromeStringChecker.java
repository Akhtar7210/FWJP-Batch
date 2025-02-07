import java.util.Scanner;

public class PalindromeStringChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for the string
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        // Reverse the string
        String reversedString = "";
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }

        // Check if the original string is equal to the reversed string
        if (originalString.equals(reversedString)) {
            System.out.println(originalString + " is a palindrome.");
        } else {
            System.out.println(originalString + " is not a palindrome.");
        }

        scanner.close();
    }
}
