package com.javabasics.day7;

import java.util.Scanner;public class TakingMultipleInputsFromKeyboard {
    public static void main(String []args){

        Scanner sc1=new Scanner(System.in);
        //Ex1
        System.out.println("Enter first number:");
        int num1=sc1.nextInt();

        System.out.println("Enter Second number:");
        int num2=sc1.nextInt();

        System.out.println("Addition of two numbers:"+(num1+num2));

        //Ex2
        System.out.println("Enter Name:");
        String name=sc1.next();
        System.out.println("Your Name is:"+name);

        System.out.println("Enter Age:");
        int age=sc1.nextInt();
        System.out.println("Your Age is:"+age);

         System.out.println("Enter unknown value:");
        Object obj=sc1.next();
        System.out.println("THe unknown value is:"+obj);

    }
}
