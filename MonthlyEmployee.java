package model;

import java.time.LocalDate;

public class MonthlyEmployee extends Employee {
    private double monthlySalary;
    private int vacationDays;
    private double bonusPercentage;
    private boolean hasHealthInsurance;

    public MonthlyEmployee(int id, String name, Gender gender, LocalDate hireDate,
                           double monthlySalary, int vacationDays,
                           double bonusPercentage, boolean hasHealthInsurance) {
        super(id, name, gender, hireDate);
        this.monthlySalary = monthlySalary;
        this.vacationDays = vacationDays;
        this.bonusPercentage = bonusPercentage;
        this.hasHealthInsurance = hasHealthInsurance;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public boolean isHasHealthInsurance() {
        return hasHealthInsurance;
    }

    public void setHasHealthInsurance(boolean hasHealthInsurance) {
        this.hasHealthInsurance = hasHealthInsurance;
    }

    public int calculateAdditionalVacation() {
        // One additional vacation day for every full year of service.
        int years = LocalDate.now().getYear() - getHireDate().getYear();
        return Math.max(0, years);
    }

    @Override
    public double calculateSalary() {
        double bonus = monthlySalary * bonusPercentage;
        double insuranceDeduction = hasHealthInsurance ? 0 : 0;
        return monthlySalary + bonus - insuranceDeduction;
    }

    @Override
    public String toString() {
        return "MonthlyEmployee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", hireDate=" + getHireDate() +
                ", monthlySalary=" + monthlySalary +
                ", vacationDays=" + vacationDays +
                ", bonusPercentage=" + bonusPercentage +
                ", hasHealthInsurance=" + hasHealthInsurance +
                ", additionalVacation=" + calculateAdditionalVacation() +
                ", salary=" + calculateSalary() +
                '}';
    }
}
