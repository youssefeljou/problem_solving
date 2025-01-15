package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Team {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int teamNumbers=scanner.nextInt();
        int answer1;
        int answer2;
        int answer3;
        int result=0;

        for (int i = 0; i < teamNumbers; i++)
        {
            answer1=scanner.nextInt();
            answer2=scanner.nextInt();
            answer3=scanner.nextInt();

            if (answer1+answer2+answer3>=2)
            {
                result++;
            }
        }
        System.out.println(result);

    }
}