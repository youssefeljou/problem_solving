package org.example;

import java.util.Scanner;

public class FactorialProblem {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            long num = scanner.nextLong();

            if (num == 1) {
                System.out.print("NO");
            } else {
                System.out.print("YES");
            }
        }
    }
