import java.util.Scanner;

class Q7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks: ");
        double marks = scanner.nextDouble();

        System.out.print("Enter total marks: ");
        double totalMarks = scanner.nextDouble();

        double percentage = (marks / totalMarks) * 100;

        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");

        scanner.close();
    }
}
