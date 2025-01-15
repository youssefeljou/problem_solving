package org.example;

import java.util.Scanner;

public class SearchInMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] arr = new int[rows][columns];

        // Reading the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // Number to search
        int num = scanner.nextInt();
        boolean found = false;

        // Searching for the number in the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] == num) {
                    found = true;
                    break;
                }
            }
            if (found) break; // Exit outer loop if found
        }

        // Print result
        if (found) {
            System.out.println("will not take number");
        } else {
            System.out.println("will take number");
        }
    }
}
