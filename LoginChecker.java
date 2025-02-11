import java.util.Scanner;

public class LoginChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String validUserId = "admin";
        String validPassword = "password";

        System.out.print("Enter your user ID: ");
        String userId = scanner.next();

        System.out.print("Enter your password: ");
        String password = scanner.next();

        scanner.close();

        if (userId.equals(validUserId) && password.equals(validPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid user ID or password. Please try again.");
        }
    }
}


