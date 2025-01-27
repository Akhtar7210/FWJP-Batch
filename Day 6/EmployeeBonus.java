import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String args[]) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's salary: $");
        double salary = scanner.nextDouble();
        System.out.print("Enter years of experience: ");
        int experience = scanner.nextInt();
        double bonus = experience > 20 ? (salary * 0.20) : (salary * 0.10);
        
        System.out.println("\nEmployee Details:");
        System.out.println("Salary: $" + salary);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Bonus Amount: $" + bonus);
        System.out.println("Total Amount: $" + (salary + bonus));
        
        scanner.close();
    }
}