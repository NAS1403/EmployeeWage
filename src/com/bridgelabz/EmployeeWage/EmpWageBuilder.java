package com.bridgelabz.EmployeeWage;

import java.util.ArrayList;

public class EmpWageBuilder implements ICompanyWage{
   public final int IS_FULL_TIME = 1;
   public final int IS_PART_TIME = 2;


   int noOfCompany = 0;
   ArrayList<CompanyEmpWage> companyEmpWageArrayList = new ArrayList<>();

  public  void addCompanyEmpWage(String company, int wagePerHr, int daysPerMonth, int workHrPerMonth){
       CompanyEmpWage companyEmpWage = new CompanyEmpWage(company,wagePerHr,daysPerMonth,workHrPerMonth);
       companyEmpWageArrayList.add(companyEmpWage);
   }

   public void calculateWage(){
       for (CompanyEmpWage companyEmpWage : companyEmpWageArrayList){
          companyEmpWage.setTotalWage(calculateWage(companyEmpWage));
           System.out.println(companyEmpWage);
       }
   }


    int calculateWage(CompanyEmpWage companyEmpWage){

        int empHrs;
        int totalHours=0;
        int dailyWage;
        int day=0;

        while((totalHours<companyEmpWage.workHrPerMonth) && (day<companyEmpWage.daysPerMonth)) {

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
            dailyWage =companyEmpWage.wagePerHr*empHrs;
            companyEmpWage.totalWage+=dailyWage;
            day++;
        }
        System.out.println("Total work hours is : "+totalHours);
        System.out.println("Total work days are: " +day);
        System.out.println("Total employee wage for company "+companyEmpWage.company+" is "+companyEmpWage.totalWage);
        return companyEmpWage.totalWage;
    }


}
