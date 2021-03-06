package com.bridgelabz.EmployeeWage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmpWageBuilder implements CompanyWage{
   public final int IS_FULL_TIME = 1;
   public final int IS_PART_TIME = 2;


    ArrayList<CompanyEmpWage> companyEmpWageArrayList = new ArrayList<>();
   Map<String,CompanyEmpWage> companyEmpWageMap = new HashMap<>();


  public  void addCompanyEmpWage(String company, int wagePerHr, int daysPerMonth, int workHrPerMonth){
       CompanyEmpWage companyEmpWage = new CompanyEmpWage(company,wagePerHr,daysPerMonth,workHrPerMonth);
       companyEmpWageArrayList.add(companyEmpWage);
       companyEmpWageMap.put(company,companyEmpWage);
   }

   public void calculateWage(){
       for (CompanyEmpWage companyEmpWage : companyEmpWageArrayList){
          companyEmpWage.setTotalWage(calculateWage(companyEmpWage));
           System.out.println(companyEmpWage);

       }
   }

  public int totalWageByCompany(String company){
     return companyEmpWageMap.get(company).totalWage;
   }


    public int calculateWage(CompanyEmpWage companyEmpWage){

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
        return companyEmpWage.totalWage;
    }


}
