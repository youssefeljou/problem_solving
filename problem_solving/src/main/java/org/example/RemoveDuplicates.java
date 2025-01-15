package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String text=scanner.next();
        StringBuilder stringBuilder=new StringBuilder();
        int x=0;
        Set<Character> characters=new HashSet<>();
        while (x<text.length())
        {
            if (!characters.contains(text.charAt(x)))
            {
                characters.add(text.charAt(x));
                stringBuilder.append(text.charAt(x));
            }
            x++;
        }
        System.out.println(stringBuilder);
    }
}