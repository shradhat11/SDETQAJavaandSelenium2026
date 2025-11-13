package com.javabasics.day4;

public class LargestNumber {
    public static void main(String []args){

        int a=0,b=20,c=30;

        if(a>b && a>c){
            System.out.println("The given number:" +a+" is largest");
        }
        else if(b>a && b>c){
            System.out.println("The given number:" +b+" is largest");
        }
        else if(c>a && c>b){
            System.out.println("The given number:" +
                    "" +c+" is largest");
                    }
    }
}
