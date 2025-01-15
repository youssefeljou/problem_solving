package org.example;

import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Byte numberLines=scanner.nextByte();
        int printedNumber=0;
        for (Byte i = 0; i < numberLines; i++)
        {
            for (int j = 1; j <= 4; j++)
            {
                printedNumber=(4*i)+j;
                if (j==4)
                {
                    System.out.print("PUM");
                }
                else
                {
                    System.out.print(printedNumber+" ");
                }
            }
            System.out.println();
        }
    }
}
