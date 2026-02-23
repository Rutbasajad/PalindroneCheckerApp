/**
 * -------------------------------------------------------
 * MAIN CLASS – UseCase4PalindromeCheckerApp
 * -------------------------------------------------------
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts string to char array
 * - Uses two pointers
 * - Compares characters efficiently
 *
 * This reduces extra memory usage.
 *
 * @author Developer
 * @version 4.0
 */

import java.util.Scanner;

public class PalindromeChecker {

    /**
     * Application entry point for UC4.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declare and initialize the input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert string into character array
        char[] chars = input.toCharArray();

        // Initialize pointer at the beginning
        int start = 0;

        // Initialize pointer at the end
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Continue comparison until pointers cross
        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The given string is a PALINDROME.");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}