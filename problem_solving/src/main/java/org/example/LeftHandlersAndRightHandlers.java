package org.example;

import java.util.Scanner;

public class LeftHandlersAndRightHandlers {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int leftHandlers=scanner.nextInt();
        int rightHandlers=scanner.nextInt();
        int ambidexters=scanner.nextInt();
        int diff;
        if (leftHandlers < rightHandlers)
        {
            diff=Math.min(ambidexters,rightHandlers-leftHandlers);
            leftHandlers+=diff;
            ambidexters-=diff;
        }
        else if(leftHandlers > rightHandlers)
        {
            diff=Math.min(ambidexters,leftHandlers-rightHandlers);
            rightHandlers+=diff;
            ambidexters-=diff;
        }

            diff=ambidexters/2;
            rightHandlers+=diff;
            leftHandlers+=diff;
        int team=2*(Math.min(rightHandlers,leftHandlers));
        System.out.println(team);
    }
}