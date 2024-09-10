package org.example;

public class Exercise07 {
    public static int countWords(String str) {

        String[] words = str.trim().split("\\s+");


        return words.length;
    }

    public static void main(String[] args) {
        String str = "Hello, world!";
        int count = countWords(str);


        System.out.println("Number of words in " + str + ": " + count);
    }
}