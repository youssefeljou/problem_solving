package org.example;

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int i=0;
        while (num1<=num2)
        {
            num1*=3;
            num2*=2;
            i++;
        }
        System.out.println(i);
    }
}