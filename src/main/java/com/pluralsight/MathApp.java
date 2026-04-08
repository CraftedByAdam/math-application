package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        //Question 1
        double bobSalary = 800.00;
        double garySalary = 200.00;
        double highestSalary;

        Math.max(bobSalary, garySalary);
        highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("Highest salary is: " + highestSalary);

    }
}
