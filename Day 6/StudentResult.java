import java.util.Scanner;

class StudentResult {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student's marks (out of 100): ");
        int marks = scanner.nextInt();
        
        // Using ternary operator to check pass or fail
        String result = (marks >= 35 && marks <= 100) ? "PASS" : 
                       (marks >= 0 && marks < 35) ? "FAIL" : 
                       "Invalid Marks";
        
        System.out.println("\nResult:");
        System.out.println("Marks: " + marks);
        System.out.println("Status: " + result);
        
        scanner.close();
    }
}