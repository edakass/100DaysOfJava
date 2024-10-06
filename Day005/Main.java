import java.util.Scanner;

public class Main {

    public static int factorial(int n) {
        // Base Case
        if(n <= 0) {
            return 1;
        } else {  // Recursive Case
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int n = sc.nextInt();

        System.out.println("Result: " + factorial(n));
    }
}
/*
Please enter number: 5
Result: 120
 */