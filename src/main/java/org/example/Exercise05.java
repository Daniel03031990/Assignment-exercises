package org.example;

public class Exercise05 {
    public static void main(String[] args) {
        String str1="Listen";
        String str2="Silent";
        int count1 =0;
        int count2=0;


        for (int i = 0; i < str1.length(); i++) {
            count1 =+str1.length();
        }
        System.out.println(count1);
        for (int i = 0; i < str2.length(); i++) {
            count2=+str2.length();
            if (count1==count2){
                return;
            }else{
                System.out.println("The Strings are not");
            }
        }









    }
}
