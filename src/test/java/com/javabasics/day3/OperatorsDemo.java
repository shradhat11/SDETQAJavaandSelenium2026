package com.javabasics.day3;

public class OperatorsDemo {
    public static void main(String []args){

        //1- Arithematic operators  + - * / % - works only on numeric type of data
        int a=40,b=20;
        System.out.println("Sum of a and b :"+(a+b));
        System.out.println("Difference of a and b :"+(a-b));
        System.out.println("Multiplication of a and b :"+(a*b));
        System.out.println("Division of a and b :"+(a/b));
        System.out.println("Remainder of a and b :"+(a%b));

        //2 - Relational operators > >= < <= != == - works best in conditional and looping statements
        //  This will always return a boolean value

        System.out.println(a>b); //true
        System.out.println(a<b); //false
        System.out.println(a>=b); //true
        System.out.println(a<=b); //false
        System.out.println(a!=b); //true
        System.out.println(a==b); //false

        //3 Logical operators && || ! - returns a boolean value

        boolean x= true;
        boolean y = false;
        System.out.println(x && y); // false
        System.out.println(x || y);   //true
        System.out.println(!x);   //false
        System.out.println(!y);    //true

        boolean b1=10>20;// this works and is valid and will return a boolean value
        System.out.println(b1); //false

        boolean b2=20>10;
        System.out.println(b2);  //true

        System.out.println(b1 && b2); //false
        System.out.println(b1 || b2); //true

        System.out.println((10<20) && (20>10)); //true

        //4 Increment n Decrement operators

    }
}
