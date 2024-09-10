package org.example;

public class Exercise02 {
    public static void main(String[] args) {
        String input = "a,sadmefd3244knsf34r";

        // Initialize a counter for alphabetic characters
        int alphaCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                alphaCount++;
            }
        }

        System.out.println("Number of alphabetic characters: " + alphaCount);
    }
}
