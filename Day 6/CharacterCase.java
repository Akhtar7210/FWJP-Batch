import java.util.Scanner;

class CharacterCase {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        // Using ternary operator to check character case
        String result = (ch >= 'a' && ch <= 'z') ? "Lowercase character" : 
                       (ch >= 'A' && ch <= 'Z') ? "Uppercase character" : 
                       "Not an alphabet";
        
        System.out.println("\nResult:");
        System.out.println("Character: " + ch);
        System.out.println("Case: " + result);
        
        scanner.close();
    }
}