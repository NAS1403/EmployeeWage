package com.bridgelabz.EmployeeWage;

public class EmpWageBuilder {
   public final int IS_FULL_TIME = 1;
   public final int IS_PART_TIME = 2;

    String company;
    int wagePerHr;
    int daysPerMonth;
    int workHrPerMonth;
    int totalWage;


    public EmpWageBuilder(String company, int wagePerHr, int daysPerMonth, int workHrPerMonth) {
        this.company = company;
        this.wagePerHr = wagePerHr;
        this.daysPerMonth = daysPerMonth;
        this.workHrPerMonth = workHrPerMonth;
    }

    @Override
    public String toString() {
        return "Total employee wage for  "+ company+ " is "+ totalWage;
    }

    void calculateWage(){

        int empHrs;
        int totalHours=0;
        int dailyWage;
        int day=0;

        while((totalHours<workHrPerMonth) && (day<daysPerMonth)) {

            int attendance = (int)(Math.floor(Math.random()*10))%3;
            switch (attendance) {
                case IS_FULL_TIME:
                    empHrs=8;
                    break;
                case IS_PART_TIME:
                    empHrs=4;
                    break;
                default:
                    empHrs=0;
                    break;
            }
            totalHours+=empHrs;
            dailyWage = wagePerHr*empHrs;
            totalWage+=dailyWage;
            day++;
        }
        System.out.println("Total work hours is : "+totalHours);
        System.out.println("Total work days are: " +day);
    }


}
