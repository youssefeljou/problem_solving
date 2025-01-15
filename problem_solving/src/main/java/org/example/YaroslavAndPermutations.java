package org.example;

import java.util.*;

public class YaroslavAndPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers = scanner.nextInt();
        int evenOrOdd=(numberOfNumbers+1)/2;
        int num;
        Map<Integer,Integer> numbers=new HashMap<>();
        for (int i = 0; i < numberOfNumbers; i++)
        {
            num=scanner.nextInt();
            numbers.put(num,numbers.getOrDefault(num,0)+1);
        }
        if (numbers.values().stream().max(Comparator.naturalOrder()).orElse(0)>evenOrOdd)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }

    }
}