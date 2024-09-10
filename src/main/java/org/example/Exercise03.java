package org.example;

public class Exercise03 {

    public static String reverseString(String str) {

        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {

        String str = "syntax";

        // Reverse the string
        String reversedStr = reverseString(str);

        // Print the reversed string
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}





