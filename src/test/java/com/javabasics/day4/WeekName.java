package com.javabasics.day4;

public class WeekName {
    public static void main(String []args){
         int week_no=8;

         if(week_no ==0){
            System.out.println("The day is Sunday");
         }
         else if(week_no ==1){
             System.out.println("The day is Monday");
         }
         else if(week_no ==2){
             System.out.println("The day is Tuesday");
         }
         else if(week_no ==3){
             System.out.println("The day is Wednesday");
         }
         else if(week_no ==4){
             System.out.println("The day is Thursday");
         }
         else if(week_no ==5){
             System.out.println("The day is Friday");
         }
         else if(week_no ==6){
             System.out.println("The day is Saturday");
         }
         else{
             System.out.println("Enter a valid week number");
         }
    }
}
