package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise10 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("apple");
        arrayList.add("orange");
        arrayList.add("banana");

        Set<String> set = new HashSet<>(arrayList);
        ArrayList<String> last=new ArrayList<>(set);

        System.out.println("ArrayList: " + last);
    }
}

