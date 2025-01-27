import java.util.Scanner;

class CharacterCheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        String isAlphabet = Character.isLetter(ch) ? "It is an alphabet" : "Not an alphabet";
        
        String letterCase = Character.isLetter(ch) ? 
            (Character.isUpperCase(ch) ? "Uppercase" : "Lowercase") : "";
            
        // Convert to lowercase and check vowel using ternary
        char lowerCh = Character.toLowerCase(ch);
        String isVowel = Character.isLetter(ch) ? 
            (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u' ? 
            "It is a vowel" : "It is a consonant") : "";
        
        // Print results
        System.out.println("\nResults for character '" + ch + "':");
        System.out.println(isAlphabet);
        if(Character.isLetter(ch)) {
            System.out.println("Case: " + letterCase);
            System.out.println("Vowel check: " + isVowel);
        }
        
        scanner.close();
    }
}
