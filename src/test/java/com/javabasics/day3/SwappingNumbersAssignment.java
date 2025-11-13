package com.javabasics.day3;

public class SwappingNumbersAssignment {
    public static void main(String []args){

       //Using temporary variable
        int a=10,b=20,temp;
        System.out.println("Before swapping a is "+a+" and b is "+b);
        temp =a;
        a=b;
        b=temp;
        System.out.println("After swapping a is "+a+" and b is "+b);

        //using arithematic operator + and 1
        int q=10,r=11;
        System.out.println("Before swapping q is "+q+" and r is "+r);
        q=q+r;
        r=q-r;
        q=q-r;
        System.out.println("After swapping q is "+q+" and r is "+r);

        //using arithematic operator * and /
        int s=7,t=2;
        System.out.println("Before swapping s is "+s+" and t is "+t);
        s=s*t;
        t=s/t;
        s=s/t;
        System.out.println("After swapping s is "+s+" and t is "+t);



    }
}
