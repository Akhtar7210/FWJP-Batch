import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input range from user
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();
        
        System.out.println("Even numbers from " + start + " to " + end + " are:");
        
        // Loop through the range and print even numbers
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
