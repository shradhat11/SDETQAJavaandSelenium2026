package com.javabasics.day8;

public class StringMethods {
    public static void main(String []args){

        String str="Welcome";
        //String s= new String("welcome");
        //- another way of declaring a string

        System.out.println(str);

        //length() - returns length of a string(number of characters)
        int l=str.length();

        //"welcome".length();
        System.out.println(l);

        //concat() - used to join 2 strings

        String s1=" World";
        System.out.println(str.concat(s1));

        String s2=" People";
        System.out.println(str.concat(s1).concat(s2)); //used to join more than 2 strings

        //System.out.println(str+s1+s2);- can be used to join more than 2 strings

        //trim()- removes spaces right and left of the string
        String s3="   Wonderful   ";
        System.out.println(s3);
        System.out.println(s3.trim());
        System.out.println("Hello!");
        System.out.println("Good Morning Sunshine!");
    }
}
