package org.example;

import java.util.Scanner;

public class ColourfulStones {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        String instruction = scanner.next();
        int counter = 1;
        int x = 0;
        for (int i = 0; i < instruction.length(); i++)
        {
            if (value.toCharArray()[x]==instruction.toCharArray()[i])
            {
                x++;
                counter++;
            }
        }
        System.out.println(counter);
    }
}
