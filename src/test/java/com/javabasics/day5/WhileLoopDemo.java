package com.javabasics.day5;

public class WhileLoopDemo {
    public static void main(String args[]){

        //Example 1 " Print 1-10 numbers
        int i=1; //Initialization
        while(i<=10) //condition
        {
            System.out.println("The value of i :"+i);
            i++; //Increment
        }

        //Example 2 : Print Hello Message 1o times

        int j=0;
        while(j<=10)
        {
            System.out.println("Hello");
            j++;
        }

        //Example 3 : Print Even numbers between 1 to 10
        //aproach 1
        int k=2;
        while(k<=10){

                System.out.println("THe even number is : "+k);
                 k+=2;
        }

        //approach 2
        int l=1;
        while (l<=10){

            if(l%2 == 0) {
                System.out.println(l);
            }
            l++;
        }

        //Example 4 - print 1 to 10 and specify if the number is odd or even

        int m=1;
        while(m<=10){

            if(m%2 == 0){
                System.out.println(m+" Even");
            }
            else {
                System.out.println(m+" Odd");
            }
            m++;
        }

        //Example 5 - Print numbers 10-1 in descending order
         int n=10;
        while (n>=1){

            System.out.println(n);
            n--;
        }

    }
}
