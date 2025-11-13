package com.javabasics.day5;

public class DoWhileDemo {
    public static void main(String []args){

        //Example 1 - Print 1-10 numbers

        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);

        //Example 2 - Print 10-1 numbers

        int j=10;
        do{
            System.out.println(j);
            j--;
        }while(j>=1);


    }
}
