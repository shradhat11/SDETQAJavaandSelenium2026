package com.javabasics.day6;

public class SumOfElementsAssignment {
    public static void main(String[] args){
        int a[]={1,2,3,4,5};
        int sum=0;

        for(int x:a){
            sum=sum+x;
        }
        System.out.println("Sum of the all the elements in the array :"+ sum);
    }
}
