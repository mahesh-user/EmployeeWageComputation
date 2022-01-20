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
        for(int i=0; i<20; i++) {

            int check = random.nextInt(3);

            switch (check) {
                case present: {
                    System.out.println("Employee is present");
                    dailyWage = wagePerHour * fullTime;
                    totalWage = dailyWage + totalWage;
                    break;
                }
                case absent: {
                    System.out.println("Employee is absent");
                    dailyWage = 0;
                    totalWage = dailyWage + totalWage;
                    break;
                }
                default: {
                    System.out.println("Employee is part time");
                    dailyWage = wagePerHour * partTime;
                    totalWage = dailyWage + totalWage;
                    break;
                }
            }
        }
        System.out.println
                ("Total Wage : " + totalWage);
        }
}
