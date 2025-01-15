package org.example;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        /*
                first way
         */
        /*
        Scanner scanner=new Scanner(System.in);
        String text=scanner.next();
        int i=text.length();
        while (i>0)
        {
            System.out.print(text.charAt(i-1));
            i--;
        }
        */

        /*
                second way
         */
        /*
        Scanner scanner=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(scanner.next());
        System.out.println(sb.reverse());
        */
        Scanner scanner=new Scanner(System.in);
        StringBuffer sb=new StringBuffer(scanner.next());
        System.out.println(sb.reverse());
    }
}
