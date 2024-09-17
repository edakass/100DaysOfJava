package Day002;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // A Scanner object is created to receive input from the user
        Scanner sc = new Scanner(System.in);

        // A message is printed asking the user to enter a word or a sentence
        System.out.println("Please enter your string: ");

        // The string entered by the user is captured
        String myWord = sc.nextLine();

        // The reverse function is called, and the reversed string is printed
        System.out.println(reverse(myWord));
    }

    // A function that reverses a string
    public static String reverse(String input) {
        // StringBuilder is used to construct a string
        StringBuilder stringBuilder = new StringBuilder();

        // The input string is converted to a character array
        char[] c = input.toCharArray();

        // Characters are iterated in reverse order and appended to StringBuilder
        for (int i = c.length - 1; i >= 0; i--) {
            stringBuilder.append(c[i]);
        }

        // The reversed string is returned
        return stringBuilder.toString();
    }
}
/*
Why StringBuilder is used:
In Java, String objects are immutable, meaning they cannot be modified once created.
If we were to use a String to reverse the characters directly, every time we appended a character to the string,
a new String object would be created, which would increase both memory usage and processing time,
especially for longer strings.

StringBuilder is mutable, which means it allows modifications to its contents without creating new objects each time.
This makes StringBuilder much more efficient for situations like building or reversing strings,
where multiple appends or modifications are needed.

By using StringBuilder, we optimize memory usage and improve the performance of the string reversal process by avoiding
unnecessary object creation.
 */