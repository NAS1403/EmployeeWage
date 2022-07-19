package com.bridgelabz.EmployeeWage;

public class CompanyEmpWage {
    final String company;
    final int wagePerHr;
    final int daysPerMonth;
    final  int workHrPerMonth;
    int totalWage;

    public CompanyEmpWage(String company, int wagePerHr, int daysPerMonth, int workHrPerMonth) {
        this.company = company;
        this.wagePerHr = wagePerHr;
        this.daysPerMonth = daysPerMonth;
        this.workHrPerMonth = workHrPerMonth;
    }

    @Override
    public String toString() {
        return "CompanyEmpWage{" +
                "company='" + company + '\'' +
                ", wagePerHr=" + wagePerHr +
                ", daysPerMonth=" + daysPerMonth +
                ", workHrPerMonth=" + workHrPerMonth +
                ", totalWage=" + totalWage +
                '}';
    }
}
