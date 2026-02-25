import java.util.*;

public class PalindromeCheckerApp {

    // 1️⃣ Two Pointer Approach
    public static boolean twoPointer(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static boolean stackMethod(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray())
            stack.push(ch);

        for (char ch : str.toCharArray())
            if (ch != stack.pop())
                return false;

        return true;
    }

    public static boolean recursiveMethod(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        return recursiveCheck(str, 0, str.length() - 1);
    }

    private static boolean recursiveCheck(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return recursiveCheck(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        long start1 = System.nanoTime();
        boolean result1 = twoPointer(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean result3 = recursiveMethod(input);
        long end3 = System.nanoTime();

        System.out.println("\n===== Performance Comparison =====");
        System.out.println("Two Pointer Time: " + (end1 - start1) + " ns");
        System.out.println("Stack Method Time: " + (end2 - start2) + " ns");
        System.out.println("Recursive Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}