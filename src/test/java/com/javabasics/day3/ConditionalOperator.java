package com.javabasics.day3;

public class ConditionalOperator {
    public static void main(String []args){
        //ex1
        int a=100,b=200;
        int c=(a>b) ? a :b ;
        System.out.println(c);

        //ex2
        int w=(1==1)? 100:200;
        System.out.println(w);

        int y=(1==2)? 100:200;
        System.out.println(y);

        //ex3
        int person_age=30;
        String res=(person_age>=18)? "Eligible" : "NotEligible";
        System.out.println(res);

    }
}
