package com.javabasics.day7;

import javax.swing.*;

public class LinearSearch {

  public static void main(String[] args) {

    // Search an element in array(linear array)

    int arr[] = {100, 200, 300, 400, 500,200,200};
    int temp = 200;
    boolean status= false; //false - not found true - found

    // regular for loop - for(int i=0;i<arr.length:i++)
    for (int x : arr) {
      if (temp == x) {
        System.out.println("The number is present in the array:" + x);
        status =true;
        break;
      }
    }
    if(status ==false)
    System.out.println("Element not found");
  }
}