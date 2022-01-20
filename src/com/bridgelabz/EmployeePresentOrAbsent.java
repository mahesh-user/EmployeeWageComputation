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
        int totalWage;
        int check = random.nextInt(3);
        switch (check ) {
            case present:{
               System.out.println("Employee is present");
               totalWage = wagePerHour * fullTime;
               break;
            }
            case absent:{
                System.out.println("Employee is absent");
                totalWage = 0;
                break;
            }
            default:{
                System.out.println("Employee is part time");
                totalWage =wagePerHour*partTime;
                break;
            }
            }
        System.out.println("Total Wage : " + totalWage);
        }
}
