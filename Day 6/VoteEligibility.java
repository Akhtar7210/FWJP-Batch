import java.util.Scanner;
class VoteEligibility {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Using ternary operator to check eligibility
        String result = age >= 18 ? "You are eligible to vote!" : "You are not eligible to vote yet.";
        
        System.out.println("\nResult:");
        System.out.println("Age: " + age);
        System.out.println(result);
        
        scanner.close();
    }
}