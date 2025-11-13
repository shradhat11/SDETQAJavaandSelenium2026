package com.javabasics.day6;

/*1) Declare an array
2) add values into an array
3) find length/size of an array
4) read single value from an array
5) read multiple values from an array
 */

public class SingleDimensionArray {
    public static void main(String []args){

        //declaring array

        //approach 1 - when you know the size of the array
        int a[]=new int[5];
        a[0]=2;
        a[1]=3;
        a[2]=5;
        a[3]=9;
        a[4]=10;

        //approach 2 - when you dont know the size of the array
        int b[]={100,200,300,400,500};

        //find the length of the array
        int size=b.length;
        System.out.println("The length of an array: "+size);

    // read a specific value from an array

    System.out.println("The 5th element in the array :"+b[4]);

    //read all the elements from an array
        for(int s=0;s<b.length;s++){
        System.out.println(b[s]);
        }

        //for each loop-enhanced for loop
        for(int c:b)
        {
            System.out.println(c);
        }
    }
}
