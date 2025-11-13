package com.javabasics.day3;

public class DecrementOperator {
    public static void main(String []args){
        //-- is called decrement operator

        //Case 1
        int a=10;
        System.out.println(a);
        a--;  //a=a+1
        System.out.println(a);

        //Case 2 Post Decrement
        int b=10;
        System.out.println(b);
        int result=b--; // the current value of b is stored in result and then the value of b is incremented
        System.out.println(result);
        System.out.println(b);

        //Case 3 Pre Decrement
        int c=10;
        System.out.println(c);
        int res=--c; // as it is pre the increment of c is done and then the value is stored in res.
        System.out.println(res);
        System.out.println(c);
    }
}
