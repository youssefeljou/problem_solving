package org.example;

public class CompareEqualityOfTwoStrings {
    public static void main(String[] args)
    {
        String text1="YOUSSEh";
        String text2="youssef";

        System.out.println(check(text1,text2));

    }
    public static boolean check(String text1,String text2)
    {
        text1=text1.toLowerCase();
        text2=text2.toLowerCase();
        if (text1.equals(text2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}