package org.example;

import java.util.Scanner;

public class WatermelonProblem {

    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num == 2) {
                System.out.println("no");
            } else if (num % 2 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
