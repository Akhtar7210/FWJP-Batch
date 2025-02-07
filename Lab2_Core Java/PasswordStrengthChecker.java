import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for the password
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        // Variables to store the strength criteria
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Loop to check each character in the password
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            }
        }

        // Check if all criteria are met
        if (hasUppercase && hasLowercase && hasDigit && hasSpecialChar) {
            System.out.println("Password is strong.");
        } else {
            System.out.println("Password is weak. It should contain at least one uppercase letter, one lowercase letter, one digit, and one special character.");
        }

        scanner.close();
    }
}
