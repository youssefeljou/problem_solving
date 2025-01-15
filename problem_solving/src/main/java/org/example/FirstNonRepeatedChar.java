package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String text=scanner.next();
        int x=0;
        Set<Character> characters=new LinkedHashSet<>();
        while (x<text.length())
        {
            if (!characters.contains(text.charAt(x)))
            {

                characters.add(text.charAt(x));

            }
            else
            {
                characters.remove(text.charAt(x));
            }
            x++;
        }
        System.out.println(characters.stream().findFirst().get());
    }
}