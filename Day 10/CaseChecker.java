

import java.util.Scanner;

public class CaseChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        scanner.close();

        if (Character.isLowerCase(character)) {
            System.out.println(character + " is in lower case.");
        } else if (Character.isUpperCase(character)) {
            System.out.println(character + " is in upper case.");
        } else {
            System.out.println(character + " is not a letter.");
        }
    }
}
