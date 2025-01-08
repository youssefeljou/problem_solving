package org.example;

import java.util.Scanner;

public class SomeSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        int num = scanner.nextInt();
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        long sum = 0;

        // Iterate through all numbers from 1 to num
        for (int i = 1; i <= num; i++) {
            int digitSum = sumOfDigits(i); // Calculate digit sum

            // Check if digit sum is in the range [min, max]
            if (digitSum >= min && digitSum <= max) {
                sum += i; // Add to the total sum
            }
        }

        System.out.println(sum); // Print the result
    }

    // Helper method to calculate the sum of digits of a number
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Add the last digit
            num /= 10;       // Remove the last digit
        }
        return sum;
    }
}
