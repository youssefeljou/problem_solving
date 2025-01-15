package org.example;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String text=scanner.next();
        int x=0;
        text=text.toLowerCase();
        char ch;
        int vowels=0;
        int consonants=0;
        while (x<text.length())
        {
            ch=text.charAt(x);
            if (Character.isLetter(ch))
            {
                if (ch=='a'||ch=='o'||ch=='e'||ch=='i'||ch=='u')
                {
                    vowels++;
                }
                else
                {
                    consonants++;
                }
            }
            x++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}