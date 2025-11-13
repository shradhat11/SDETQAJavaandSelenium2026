package com.javabasics.day6;

public class TwoDimensionalArray {
    public static void main(String []args){

        //declaring array -all the below mentioned ways work same
        /* int a[][]=new int[3][3]
        int [][]a= new int[3][3]
        int []a[]=new int [3][3]
         */

        int a[][] = new int[2][2];
        a[0][0]=10;
        a[0][1]=20;
        a[1][0]=30;
        a[1][1]=40;

        //declaring array
        int b[][]={{9,8},{7,6},{5,4}};

    // find the size of the array
    System.out.println("Length of rows :"+b.length);
    System.out.println("Length of columns:"+b[0].length);

    // read single element from an array
    System.out.println(b[1][1]);

    //read all the elements from an array
        for(int i=0;i<b.length;i++ ){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        //for each loop
        for(int arr[] :a){
            for(int x:arr){
        System.out.println(x);
            }

        }
    }


}
