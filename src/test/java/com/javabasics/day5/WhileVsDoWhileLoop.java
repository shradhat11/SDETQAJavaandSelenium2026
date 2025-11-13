package com.javabasics.day5;public class WhileVsDoWhileLoop {

    public static void main(String []args){

        //while loop
        int i=1;
        while(i<=5){
            System.out.println(i);

            i++;
        }

        //DoWhile Loop
        int j=1;
        do{
            System.out.println(j);
            j++;
        }while(j<=5);
    }
}
