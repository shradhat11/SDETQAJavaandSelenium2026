package com.javabasics.day7;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String []args){

        int a[]={5,4,7,3,8};
        int b[] = new int[5];
        int i=0;
        System.out.println("Before sorting...");
        Arrays.toString(a);

        System.out.println("After sorting...");
        for(int x=a.length-1;x>=0;x--){
            b[i]= a[x];
            i++;
            //System.out.println(a[x]);

        }
    System.out.println(Arrays.toString(b));
    }
}
