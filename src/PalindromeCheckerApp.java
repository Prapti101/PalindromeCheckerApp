public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "madam";
        // Convert string to character array
        char[] characters = input.toCharArray();
        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            // Compare start and end characters
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}
