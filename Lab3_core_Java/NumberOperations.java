// Wap to perform some operations by giving user operations to perform each operation.
// 1. check prime number
// 2. check Armstrong number
// 3. print fibonacci series
// 4. check even number
// 5. exit

import java.util.Scanner;

public class NumberOperations {

    // Method to check if a number is prime
    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is an Armstrong number
    static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0, digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == originalNum;
    }

    // Method to print Fibonacci series up to 'n' terms
    static void printFibonacci(int terms) {
        int a = 0, b = 1, next;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Method to check if a number is even
    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Check Prime Number");
            System.out.println("2. Check Armstrong Number");
            System.out.println("3. Print Fibonacci Series");
            System.out.println("4. Check Even Number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter a number: ");
                int primeNum = scanner.nextInt();
                if (isPrime(primeNum)) {
                    System.out.println(primeNum + " is a Prime Number");
                } else {
                    System.out.println(primeNum + " is not a Prime Number");
                }
            } 
            else if (choice == 2) {
                System.out.print("Enter a number: ");
                int armstrongNum = scanner.nextInt();
                if (isArmstrong(armstrongNum)) {
                    System.out.println(armstrongNum + " is an Armstrong Number");
                } else {
                    System.out.println(armstrongNum + " is not an Armstrong Number");
                }
            } 
            else if (choice == 3) {
                System.out.print("Enter the number of terms: ");
                int terms = scanner.nextInt();
                printFibonacci(terms);
            } 
            else if (choice == 4) {
                System.out.print("Enter a number: ");
                int evenNum = scanner.nextInt();
                if (isEven(evenNum)) {
                    System.out.println(evenNum + " is an Even Number");
                } else {
                    System.out.println(evenNum + " is an Odd Number");
                }
            } 
            else if (choice == 5) {
                System.out.println("Exiting the program. Goodbye!");
                scanner.close();
                break;
            } 
            else {
                System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
