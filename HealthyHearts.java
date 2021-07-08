package com.sg.foundations.cumulativeExercises;

import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int age;
        int maxHR;

        System.out.print("What is your age? ");
        age = scan.nextInt();
        maxHR = 220 - age;
        System.out.printf("Your maximum heart rate should be %d beats per minute%nYour target HR Zone is %d - %d beats per minute",
                maxHR, maxHR/2, maxHR*17/20);
    }
}
