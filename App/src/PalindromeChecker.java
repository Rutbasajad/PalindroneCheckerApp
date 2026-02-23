/**
 * -------------------------------------------------------
 * MAIN CLASS – UseCase5PalindromeCheckerApp
 * -------------------------------------------------------
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure and LIFO principle.
 *
 * At this stage, the application:
 * - Pushes all characters into a stack
 * - Pops them in reverse order
 * - Compares with original string
 *
 * This introduces stack-based reversal logic.
 *
 * @author Developer
 * @version 5.0
 */

import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {

    /**
     * Application entry point for UC5.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declare and initialize the input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Pop characters and compare with original string
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }
}