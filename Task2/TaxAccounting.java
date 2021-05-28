package com.company.Weak4Day3.Task2;

public class TaxAccounting extends Accounting{
    private int waterTax;
    private int lightTax;
    private int otherTax;

    public int getWaterTax() {
        return waterTax;
    }

    public void setWaterTax(int waterTax) {
        this.waterTax = waterTax;
    }

    public int getLightTax() {
        return lightTax;
    }

    public void setLightTax(int lightTax) {
        this.lightTax = lightTax;
    }

    public int getOtherTax() {
        return otherTax;
    }

    public void setOtherTax(int otherTax) {
        this.otherTax = otherTax;
    }

    public TaxAccounting() {

    }

    public TaxAccounting(int waterTax, int lightTax, int otherTax) {
        this.waterTax = waterTax;
        this.lightTax = lightTax;
        this.otherTax = otherTax;
    }

    @Override
    protected void account() {
        int allTax = waterTax + lightTax + otherTax;
        System.out.println(allTax);
    }

}
