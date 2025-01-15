package org.example;

import java.util.Scanner;

public class SummationFrom1ToN {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        long num=scanner.nextLong();
        long sum=(num*(num+1))/2;

        System.out.println(sum);
    }
}
