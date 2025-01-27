import java.util.Scanner;

class NumberCheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Using nested ternary operator to check number
        String result = (number > 0) ? "Positive number" : (number < 0) ? "Negative number" : "Zero";
        
        System.out.println("\nResult:");
        System.out.println("Number: " + number);
        System.out.println("Type: " + result);
        
        scanner.close();
    }
}
