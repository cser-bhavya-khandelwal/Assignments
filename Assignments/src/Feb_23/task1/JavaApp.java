/**
 * 
 */
package Feb_23.task1;

/**
 * 
 */

import java.util.Scanner;

public class JavaApp {
    public static void execution() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char inputChar = sc.next().charAt(0);  // Take first character
        
        CharacterVerifierSystem.verifyChar(inputChar);
        
        sc.close();
    }
}