package Day001;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Input is taken from the user with the Scanner class.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your string: ");

        // The string entered by the user is assigned to the variable 'yourString'.
        String yourString = scanner.nextLine();
        reverse(yourString);

        // The method that reverses the string is called, and the result is printed.
        System.out.println(reverse(yourString));
    }

    public static String reverse(String word) {
        // An empty string is defined to create the reversed string.
        String str = "";

        // The input string is converted into a char array.
        char[] chars = word.toCharArray();
        // word: "eda"  chars: [e, d, a]

        // The for loop iterates over the char array from the end to the beginning.
        // chars.length - 1 gets the last character of the array.
        // i >= 0 condition ensures it goes until the start of the array.
        for (int i = chars.length - 1; i >= 0; i--) {
            // Each character is added to the empty string.
            str += chars[i];
        }

        // The reversed string is returned.
        return str;
    }
}
/*

Please enter your string:
eda
ade
 */