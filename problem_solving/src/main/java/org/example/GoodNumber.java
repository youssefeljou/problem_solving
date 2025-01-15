package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GoodNumber {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int numberLines=scanner.nextInt();
        int numberRange=scanner.nextInt();
        String line;
        int result=0;
        boolean flag=false;
        for (int i = 0; i < numberLines; i++)
        {
            line= scanner.next();
            Set<Character> digits = new HashSet<>();
            for (char x:line.toCharArray())
            {
                digits.add(x);
            }

            flag=true;
           for (char x='0';x<=('0'+numberRange);x++)
           {
               if (digits.contains(x))
               {
                   flag=true;
               }
               else
               {
                   flag=false;
               }
           }
           if (flag)
           {
               result++;
           }
        }
        System.out.println(result);
    }
}