import java.util.Scanner;

class VowelCheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
     
        ch = Character.toLowerCase(ch);
     
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 
                       "is a Vowel" : "is not a Vowel";
        
        System.out.println("\nResult:");
        System.out.println("Character '" + ch + "' " + result);
        
        scanner.close();
    }
}