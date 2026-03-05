/**
 MAIN CLASS UseCaseiPalindromeApp
 Use Case 1: Application Entry & Welcome Message
 Description:
 This class represents the entry point of the * Palindrome Checker Management System.
 At this stage, the application:
 Starts execution from the main() method
 * - Displays a welcome message
 Shows application version
 No palindrome logic is implemented yet.
 The goal is to establish a clear startup flow.
 @author pc3604padma
 @version 1.0
 */
import java .util.Scanner;
public class PalindromeCheckerApp {
    /**
    Application entry point.
    This is the first method executed by the JVM
    when the program starts.
    @param args Command-Line arguments
    */
public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    System.out.print

    String reverse = "";
    // Iterate from the last character to the first.
    for (int i = input.length() - 1; i >= 0; i--) {
        reverse += input.charAt(i);
    }
    if (input.equals(reverse)) {
        System.out.println("The string is a palindrome.");
    } else {
        System.out.println("The string is not a palindrome.");
    }
}
}
