package com.javabasics.day2;

public class VariablesDemo {
    public static void main(String args[]){

        int age; //declaration
        age=30; //assignment

        int a=100; // single statement - Declaration+ assignment

        System.out.println(age);
        age=45;
        System.out.println(age);

        //Approach1 - IF all the variables belong to differnet datatypes
        /*int q=10;
        int w=19;
        int e=93;*/

        //Approach 2 - IF all the variable belongs to same data type
        /* int a,b,c;
        a=7;
        b=4;
        c=9; */

        //Approach 3 - if all the variable belongs to same data type
         int r=99,b=76,p=33;

        System.out.println("The value of r: "+r);
        System.out.println("The value of b: "+b);
        System.out.println("The value of p: "+p);

        System.out.println(r+" "+b+" "+p);
    }
}
