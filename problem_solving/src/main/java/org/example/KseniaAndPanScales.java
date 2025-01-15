package org.example;

import java.util.Scanner;

public class KseniaAndPanScales {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String[] text=scanner.nextLine().split("\\|");
        String left = (text.length > 0) ? text[0]  : "";
        String right = (text.length > 1) ? text[1] : "";
        String unusedWeight=scanner.nextLine();


        int rightLength=right.length();
        int leftLength=left.length();
        int unusedWeightLength=unusedWeight.length();
        int diff=Math.abs(rightLength-leftLength);
        if (unusedWeightLength < diff ||(unusedWeightLength - diff) % 2 != 0) {
            System.out.println("Impossible");
            return;
        }
        StringBuilder leftBuilder = new StringBuilder(left);
        StringBuilder rightBuilder = new StringBuilder(right);

        if (leftLength < rightLength) {
            leftBuilder.append(unusedWeight.substring(0, diff));
            unusedWeight = unusedWeight.substring(diff);
        } else if (rightLength < leftLength) {
            rightBuilder.append(unusedWeight.substring(0, diff));
            unusedWeight = unusedWeight.substring(diff);
        }

        int half = unusedWeight.length() / 2;
        leftBuilder.append(unusedWeight.substring(0, half));
        rightBuilder.append(unusedWeight.substring(half));

        System.out.println(leftBuilder + "|" + rightBuilder);
    }
}