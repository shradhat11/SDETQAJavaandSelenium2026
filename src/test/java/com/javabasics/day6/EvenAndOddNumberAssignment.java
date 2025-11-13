package com.javabasics.day6;

public class EvenAndOddNumberAssignment {
    public static void main(String []args){

        int a[]={1,2,3,4,5,6};
        int even=0,odd=0;
        for(int y:a){
            if (y%2 ==0){
                System.out.println("The number is an Even number :"+y);
                even++;
            }
            else {
                System.out.println("The number is an Odd number :"+y);
                odd++;
            }

        }
        System.out.println("Number of even numbers in the array :"+even);
        System.out.println("Number of odd numbers in the array :"+odd);
    }
}
