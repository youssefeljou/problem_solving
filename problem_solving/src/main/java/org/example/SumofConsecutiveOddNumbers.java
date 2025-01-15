package org.example;

import java.util.Scanner;

public class SumofConsecutiveOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            // Ensure X is the smaller number and Y is the larger
            if (X > Y) {
                int temp = X;
                X = Y;
                Y = temp;
            }

            int sum = 0;
            // Loop through numbers between X and Y (exclusive)
            for (int i = X + 1; i < Y; i++) {
                if (i % 2 != 0) { // Check if the number is odd
                    sum += i;
                }
            }

            System.out.println(sum); // Print the result for each test case
        }

        scanner.close();
    }
}
