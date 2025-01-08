package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitsProblem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        List<Long> nums=new ArrayList<>();
        long result,digit;
        for (int i = 0; i < num; i++)
        {
          nums.add(scanner.nextLong());
        }

        for (int i = 0; i < num; i++)
        {
         result=nums.get(i);
         if (result ==0)
         {
             System.out.println(0);
             continue;
         }
         while (result>0)
         {
             digit=result % 10;
             result/=10;
             System.out.print(digit+" ");
         }
            System.out.println();
        }

    }
}
