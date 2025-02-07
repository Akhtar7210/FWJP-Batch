import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of even numbers to print: ");
        int count = scanner.nextInt();
        scanner.close();

        System.out.println("The first " + count + " even numbers are:");
        for (int i = 1, num = 2; i <= count; i++, num += 2) {
            System.out.println(num);
        }
    }
}
