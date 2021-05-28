package com.company.Weak4Day3.Task3;

public class TaxAccounting extends Accounting {
    private int countOfEmployers;
    private String departmentName;

    public TaxAccounting(int countOfEmployers, String departmentName) {
        this.countOfEmployers = countOfEmployers;
        this.departmentName = departmentName;
    }

    public TaxAccounting() {
    }

    @Override
    protected void account() {
        super.account();
    }
}
