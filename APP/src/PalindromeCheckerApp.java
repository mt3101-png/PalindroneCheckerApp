import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        PalindromeCheckerApp app = new PalindromeCheckerApp();
        app.run();   // UseCase Logic starts here
    }

    // UseCase Logic
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

        scanner.close();
    }

    // Business Logic
    private boolean isPalindrome(String text) {
        if (text == null) return false;

        text = text.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}