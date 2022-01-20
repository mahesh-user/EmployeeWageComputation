package com.bridgelabz;

import java.util.Random;

public class EmployeePresentOrAbsent {

    public static void main(String[] args) {
        Random random = new Random();
        final int present = 1;
        final int absent = 0;
        int wagePerHour = 20;
        int partTime = 4;
        int fullTime = 8;
        int dailyWage = 0;
        int totalWage = 0;
        int totalHours = 0;
        int numOfDays = 20;

        while (totalHours <= 100 && numOfDays <= 20) {

            int check = random.nextInt(3);

            switch (check) {
                case present: {
                    System.out.println("Employee is present");
                    totalHours = totalHours + fullTime;
                    break;
                }
                case absent: {
                    System.out.println("Employee is absent");
                    totalHours = totalHours + 0;
                    break;
                }
                default: {
                    System.out.println("Employee is part time");
                    totalHours = totalHours + partTime;
                    break;
                }
            }
            totalWage = totalHours * wagePerHour;
        }
        System.out.println("Total Wage : " + totalWage);
    }
}