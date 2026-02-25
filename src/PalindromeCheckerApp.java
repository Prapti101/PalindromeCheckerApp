import java.util.Scanner;

class PalindromeNormalizedApp {
    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String normalized = input
                .replaceAll("\\s+", "")
                .toLowerCase();
        boolean result = isPalindrome(normalized);

        if (result)
            System.out.println("The string is a Palindrome (Ignoring spaces & case).");
        else
            System.out.println("The string is NOT a Palindrome.");

        sc.close();
    }
}