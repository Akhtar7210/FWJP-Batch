import java.util.Scanner;
class CharacterConverter 
{
    public static void main(String args[]) 
	{
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        int newAsciiValue = (int) character + 32;
        char newCharacter = (char) newAsciiValue;

        System.out.println("Original Character: " + character);
        System.out.println("New Character: " + newCharacter);

        scanner.close();
    }
}
