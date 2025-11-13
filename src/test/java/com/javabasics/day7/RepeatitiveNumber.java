package com.javabasics.day7;

public class RepeatitiveNumber {
    public static void main(String []args){

        //ex- find the number of repeatitions
        int arr[]={10,20,30,40,50,10,10};
        int temp=4,counter=0;

        for(int x:arr){
            if(x==temp){
                counter++;

            }
        }
        System.out.println("The number "+temp+" is repeated "+counter+" times");

    }
}
