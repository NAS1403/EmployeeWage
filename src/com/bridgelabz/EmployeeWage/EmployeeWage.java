package com.bridgelabz.EmployeeWage;

public class EmployeeWage {

    static final int IS_PRESENT = 1;
    static final int IS_PART_TIME = 2;
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 16;
    static final int PART_TIME_HOUR = 8;
    static final int WORKING_DAY_PER_MONTH = 20;

    public static void main(String[] args) {

        System.out.println("Welcome to EmployeeWage Program");
        int attendance = (int)(Math.floor(Math.random()*10))%3;
        switch(attendance) {
            case IS_PRESENT:
                System.out.println("Employee is working Full Time");
                int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                System.out.println("Employee daily wage is: " + dailyWage);
                int monthlyWage = dailyWage * WORKING_DAY_PER_MONTH;
                System.out.println("Employee monthly wage is : "+ monthlyWage);
                break;
            case IS_PART_TIME:
                System.out.println("Employee is working Part Time");
                dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                System.out.println("Employee daily wage is: " + dailyWage);
                monthlyWage = dailyWage * WORKING_DAY_PER_MONTH;
                System.out.println("Employee monthly wage is : "+ monthlyWage);
                break;
            default:
                System.out.println("Employee is absent");
                break;
        }

    }

}
