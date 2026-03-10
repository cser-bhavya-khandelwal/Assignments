/**
 * 
 */
package Feb_23.task1;



public class CharacterVerifierSystem {
    
    public static void verifyChar(char c) {
        
        if (Character.isDigit(c)) {
        	System.out.println(c + " is a Digit.");
        } 
        else if (Character.isLetter(c)) {
            System.out.println(c + " is an Alphabet.");
            if (Character.isUpperCase(c)) {
                System.out.println("It is Uppercase.");
            } else {
                System.out.println("It is Lowercase.");
            }
            char lower = Character.toLowerCase(c);            
            if (lower == 'a' || lower == 'e' || lower == 'i' 
                    || lower == 'o' || lower == 'u') {
                System.out.println("It is a Vowel.");
            } else {
                System.out.println("It is a Consonant.");
            }
        } 
        else {
            System.out.println(c + " is a Symbol.");
        }
    }
}