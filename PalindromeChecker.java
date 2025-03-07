import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Sample words for testing
        String[] sampleWords = {"madam", "racecar", "hello", "A man, a plan, a canal, Panama"};

        for (String word : sampleWords) {
            System.out.println("Checking: " + word);
            isPalindromeCheck(word);
        }

        // Allow user input
        System.out.print("\nEnter a word or phrase: ");
        String text = scanner.nextLine().toLowerCase();

        isPalindromeCheck(text);

        scanner.close(); // Close the scanner
    }

    // Method to check if the input string is a palindrome
    public static void isPalindromeCheck(String text) {
        StringBuilder cleanedText = new StringBuilder();
        cleanText(text, cleanedText); // Cleaning text

        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                System.out.println("\"" + text + "\" is NOT a palindrome.\n");
                return;
            }
            left++;
            right--;
        }

        System.out.println("\"" + text + "\" is a palindrome.\n");
    }

    // Method to clean text (void method, modifies StringBuilder)
    public static void cleanText(String text, StringBuilder cleanedText) {
        for (char ch : text.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleanedText.append(ch);
            }
        }
    }
}
