import java.util.Scanner;

class EvenOddCheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Using ternary operator to check if number is even or odd
        String result = (number % 2 == 0) ? "Even number" : "Odd number";
        
        System.out.println("\nResult:");
        System.out.println("Number: " + number);
        System.out.println("Type: " + result);
        
        scanner.close();
    }
}
