package com.bridgelabz.EmployeeWage;
public class EmployeeWage {
    public static void main(String[] args) {

        EmpWageBuilder bel = new EmpWageBuilder("BEL",10,20,100);
        EmpWageBuilder situsAMC = new EmpWageBuilder("SitusAMC",20,22,90);
        bel.calculateWage();
        System.out.println(bel);
        situsAMC.calculateWage();
        System.out.println(situsAMC);
    }
}
