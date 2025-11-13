package com.javabasics.day4;

public class SmallestNumberAssignment {
    public static void main(String []args){

        int a=10,b=20,c=30;

        if(a<b && a<c){
            System.out.println("The given number:" +a+" is smallest");
        }
        else if(b<a && b<c){
            System.out.println("The given number:" +b+" is smallest");
        }
        else if(c<a && c<b){
            System.out.println("The given number:" +c+" is largest");
                    }
    }
}
