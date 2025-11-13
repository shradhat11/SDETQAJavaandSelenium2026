package com.javabasics.day4;

public class SwitchCaseAssignment {
    public static void main(String []args){

        String dayname="Sunday";
        switch (dayname){
            case "Monday" :
                System.out.println("The day is 1");
                break;
            case "Tuesday" :
                System.out.println("The day is 2");
                break;
            case "Wednesday":
                System.out.println("The day is 3");
                break;
            case "Thursday":
                System.out.println("The day is 4");
                break;
            case "Friday" :
                System.out.println("The day is 5");
                break;
            case "Saturday":
                System.out.println("The day is 6");
                break;
            case "Sunday":
                System.out.println("The day is 7");
                break;
            default:
        System.out.println("Enter a valid Week Number");
    }
    }
}
