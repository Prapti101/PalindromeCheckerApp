public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";   // String to check
        String reversed = "";

        // Reverse string using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}
