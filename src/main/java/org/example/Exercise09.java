package org.example;

import java.util.HashMap;
import java.util.Map;

public class Exercise09 {
    public static char findFirstNonRepeating(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }
        throw new RuntimeException("No non-repeating characters found.");
    }
    public static void main(String[] args) {

        String str = "abracadabra";
        try {
            char result = findFirstNonRepeating(str);
            System.out.println("The first non-repeating character is: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

