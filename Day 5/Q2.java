import java.util.Scanner;
class Q2
{
    public static void main(String args[])
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        int asciiValue = character;

        System.out.println("ASCII value of '" + character + "' is: " + asciiValue);

        scanner.close();
	}
}
