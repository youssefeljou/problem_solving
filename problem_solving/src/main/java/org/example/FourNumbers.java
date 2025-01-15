package org.example;

import java.util.Scanner;

public class FourNumbers {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        long num=scanner.nextLong();
        for (int i = 0; i < 3; i++)
        {
          num*=scanner.nextLong();
        }
        System.out.println(num);
    }
}
