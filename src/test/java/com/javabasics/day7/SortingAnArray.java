package com.javabasics.day7;

import java.util.Arrays;

public class SortingAnArray {

    public static void main(String []args){

        //Ex- sorting an array

        int a[]={9,33,2,11,47,21};
        int temp=0;

        System.out.println("Before sorting..");
        System.out.println(Arrays.toString(a));   // to print array

        Arrays.sort(a);  //sort the elements in the array in ascending order

        System.out.println("After sorting..");
        System.out.println(Arrays.toString(a));


    }
}
