package com.bridgelabz;

import java.util.Random;

public class EmployeePresentOrAbsent {
    public static void main(String[] args) {
        Random random = new Random();
        int check = random.nextInt(2);
        if (check == 1){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }


    }
}
