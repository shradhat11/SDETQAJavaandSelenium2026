package com.javabasics.day7;

import java.util.Scanner;
public class TakingInputFromKeyboard {

    public static void main(String []args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt(); // nextInt-Accepts an integer

        System.out.println("The input number is :"+num);

        System.out.println("Enter a decimal number :");
        double dec=sc.nextDouble(); // nextDouble-Accepts an decimal

        System.out.println("The input number is :"+dec);

        System.out.println("Enter your city:");
        String city=sc.next();//next-accepts String
        System.out.println("Your city is:"+city);


    }
}
