package com.javabasics.day7;

import java.util.Arrays;

public class SortingAString {

    public static void main(String []args){

        //Ex- sorting an array

        String a[]={"Jim","Tony","Hector","Dennis"};

        System.out.println("Before sorting..");
        System.out.println(Arrays.toString(a));   // to print array

        Arrays.sort(a);  //sort the elements in the array

        System.out.println("After sorting..");
        System.out.println(Arrays.toString(a));


    }
}
