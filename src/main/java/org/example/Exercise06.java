package org.example;

public class Exercise06 {
    public static int countVowels(String str) {
        str = str.toLowerCase();

        String vowels = "aeiou";
        int vowelCount = 0;

        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    public static void main(String[] args) {
        String str = "documentation";
        int count = countVowels(str);
        System.out.println("Number of vowels in " + str + ": " + count);
    }
}

