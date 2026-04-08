package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        //Question 1
        System.out.println("Question 1:");

        double bobSalary = 800.00;
        double garySalary = 200.00;
        double highestSalary;

        Math.max(bobSalary, garySalary);
        highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("Highest salary is: " + highestSalary);

        System.out.println("==========================================================");

        //Question 2
        System.out.println("Question 2:");

        double carPrice = 1000.00;
        double truckPrice = 5000.00;
        double lowestVehiclePrice;

        Math.min(carPrice, truckPrice);
        lowestVehiclePrice = Math.min(carPrice, truckPrice);
        System.out.println("Lowest vehicle price is: " + lowestVehiclePrice);

        System.out.println("==========================================================");
    }
}
