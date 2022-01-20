package com.bridgelabz;

import java.util.Random;

public class EmployeePresentOrAbsent {

    public static void main(String[] args) {
        Random random = new Random();
        int present = 1;
        int wage = 20;
        int hour = 4;
        int totalWage;
        int check = random.nextInt(2);
        if (check == present){
            System.out.println("Employee is Present");
            totalWage = wage * hour;
        }
        else{
            System.out.println("Employee is Absent");
            totalWage = 0;
        }

        System.out.println("Total wage of employee :" + totalWage);




    }
}
