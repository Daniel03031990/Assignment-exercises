package org.example;

import java.util.ArrayList;
import java.util.List;

public class Exercise08 {
    public static List<String> filterConvert(List<String> strings) {
        List<String> result = new ArrayList<>();

        for (String s : strings) {
            if (s.startsWith("A")) {
                result.add(s.toLowerCase());
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Avocado");
        stringList.add("Apricot");
        stringList.add("Grape");

        List<String> result = filterConvert(stringList);


        System.out.println("Filtered and converted strings: " + result);
    }
}

