import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Count the number of characters in the string
        int characterCount = inputString.length();

        // Output the result
        System.out.println("The number of characters in the string is: " + characterCount);

        scanner.close();
    }
}
