package com.bridgelabz;

import java.util.Random;

public class EmployeePresentOrAbsent {

    public static void main(String[] args) {
        Random random = new Random();
        int present = 1;
        int absent = 0;
        int wagePerHour = 20;
        int partTime = 4;
        int fullTime = 8;
        int totalWage;
        int check = random.nextInt(3);
        if  (check == present){
            System.out.println("Employee is Present");
            totalWage = fullTime * wagePerHour ;
        }
        else if (check == absent){
            System.out.println("Employee is Absent");
            totalWage = 0;
        }

        else{
            System.out.println("employee is partTime");
             totalWage = partTime * wagePerHour;
        }

        System.out.println("Total wage of employee :" + totalWage);




    }
}
