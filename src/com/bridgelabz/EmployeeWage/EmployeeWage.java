package com.bridgelabz.EmployeeWage;

public class EmployeeWage {

    static final int IS_PRESENT = 1;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 16;

    public static void main(String[] args) {

        System.out.println("Welcome to EmployeeWage Program");
        int attendance = (int)(Math.floor(Math.random()*10))%2;
        //System.out.println(attendance);
        if (attendance == IS_PRESENT){
            System.out.println("Employee is present");
            int dailyWage = WAGE_PER_HOUR*FULL_DAY_HOUR;
            System.out.println("Employee daily wage is: "+ dailyWage);        }
        else{
            System.out.println("Employee is absent");
        }


    }

}
