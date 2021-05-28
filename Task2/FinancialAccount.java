package com.company.Weak4Day3.Task2;

public class FinancialAccount extends Accounting {
    private int salaryOfEmployers;
    private int countOfEmployers;
    private String departmentName;
    Accounting accounting = new Accounting();





    public FinancialAccount(int salaryOfEmployers) {
//        super(countOfEmployers ,departmentName);
        this.salaryOfEmployers = salaryOfEmployers;
        this.countOfEmployers = super.getCountOfEmployers();
        this.departmentName = super.getDepartmentName();
    }

    public int getSalaryOfEmployers() {
        return salaryOfEmployers;
    }

    public void setSalaryOfEmployers(int salaryOfEmployers) {
        this.salaryOfEmployers = salaryOfEmployers;
    }


    @Override
    protected void account() {
        long salaryAll = (long) countOfEmployers * salaryOfEmployers;
        System.out.println("Salary of " +departmentName + " company is " + salaryAll);

    }
}
