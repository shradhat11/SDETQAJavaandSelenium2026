package com.javabasics.day4;

public class LargestNumberAssignment {

    public static void main(String []args){

        //Using Ternary operator
        int a=50,b=20;
        int result=a>b?a:b ;
        {
            System.out.println("The largest number is : "+result);
        }

        //Using If-Else Statement
        int p=30,r=8;
        if(p>r){
      System.out.println("The largest number is :"+p);
        }
        else {
      System.out.println("The largest number is :"+r);
        }
    }
}
