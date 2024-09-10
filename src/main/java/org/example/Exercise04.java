package org.example;

public class Exercise04 {
    public static void main(String[] args) {

        String input="madam";


        input=input.replace(" ","").toLowerCase();
        StringBuilder words=new StringBuilder(input);

        words=words.reverse();

        String toCompare= words.toString();

        if (input.equals(toCompare)){
            System.out.println("true");

        }else{
            System.out.println("false");
        }
    }

}
