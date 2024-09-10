package org.example;

public class Exercise01 {
    public static void swapStrings(String[] str1, String[] str2) {

        str1[0] = str1[0] + str2[0];

        str2[0] = str1[0].substring(0, str1[0].length() - str2[0].length());

        str1[0] = str1[0].substring(str2[0].length());
    }

    public static void main(String[] args) {
        String[] str1 = {"Hello"};
        String[] str2 = {"World"};

        System.out.println("Before Swap:");
        System.out.println("str1: " + str1[0]);
        System.out.println("str2: " + str2[0]);

        swapStrings(str1, str2);

        System.out.println("After Swap:");
        System.out.println("str1: " + str1[0]);
        System.out.println("str2: " + str2[0]);



    }
}
