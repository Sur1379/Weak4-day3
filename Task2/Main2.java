package com.company.Weak4Day3.Task2;

public class Main2 {
    public static void main(String[] args) {
        Accounting accounting = new Accounting();
        TaxAccounting tax = new TaxAccounting(66500, 42700, 84780);

        accounting.setDepartmentName("Bardahl");
        accounting.setCountOfEmployers(12);
        System.out.println(accounting.getDepartmentName());
        System.out.println(accounting.getCountOfEmployers());
        FinancialAccount salary = new FinancialAccount(1000);
        salary.setSalaryOfEmployers(1200);
        tax.account();
        salary.account();
    }
}
