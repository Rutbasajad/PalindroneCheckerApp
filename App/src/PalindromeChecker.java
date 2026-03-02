import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a string: ");
        String input = scanner.nextLine();

        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy dequeStrategy = new DequeStrategy();

        long start = System.nanoTime();
        boolean stackResult = stackStrategy.check(input);
        long end = System.nanoTime();
        long stackTime = end - start;

        start = System.nanoTime();
        boolean dequeResult = dequeStrategy.check(input);
        end = System.nanoTime();
        long dequeTime = end - start;

        System.out.println("Stack Result: " + stackResult);
        System.out.println("Stack Execution Time: " + stackTime + " ns");

        System.out.println("Deque Result: " + dequeResult);
        System.out.println("Deque Execution Time: " + dequeTime + " ns");

        scanner.close();
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        if (input == null) {
            return false;
        }

        input = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        if (input == null) {
            return false;
        }

        input = input.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}