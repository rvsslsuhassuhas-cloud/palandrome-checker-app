public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "radar";

        // Convert string to character array
        char[] chars = word.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}