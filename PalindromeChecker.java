import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String text = scanner.nextLine().toLowerCase();

        boolean isPalindrome = isPalindromeCheck(text);

        if (isPalindrome) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }

    // Method to check if the input string is a palindrome
    public static boolean isPalindromeCheck(String text) {
        String cleanedText = cleanText(text); // Remove non-alphanumeric characters
        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
