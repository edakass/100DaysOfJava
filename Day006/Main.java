import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = sc.nextInt();
        System.out.println("n: " + number);

        for (int i = 1; i <= 10; i++) {
            int result = i * number;

            System.out.println(number + " x " + i + " = " + result);
        }

    }
}
/*
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
 */