package com.javabasics.day5;

public class ForLoopDemo {

    public static void main(String []args){

        //Ex 1 = Print numbers 1-10
        for (int i=1;i<=10;i++)
        {
            System.out.println(i);
        }

        //Ex 2= Print even numbers between 1-10
        for( int j=2;j<=10;j+=2){
            System.out.println(j);
        }

        //Ex 3 =print 1 to 10 and specify if the number is odd or even
        for(int k=1; k<=10; k++){
            if(k%2 == 0){
                System.out.println(k+" "+"Even");
            }
            else {
                System.out.println(k+" "+"Odd");
            }
        }

        //Ex 4 = Print 10 to 1 in descending order

        for(int l=10; l>0;l--){
            System.out.println(l);
        }
    }
}
