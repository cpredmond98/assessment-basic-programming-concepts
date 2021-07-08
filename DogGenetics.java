package com.sg.foundations.cumulativeExercises;

import java.util.Scanner;
import java.util.Random;

public class DogGenetics {

    public static void main(String[] args) {

        int percentLeft = 100;
        String dogName;
        Random breedPercent = new Random();
        Scanner scan = new Scanner(System.in);
        String[] breeds = {"Poodle", "Lab", "Golden Retriever", "Dalmatian", "Husky"};
        int[] percents = new int[breeds.length];

        System.out.print("What is your dog's name? ");
        dogName = scan.nextLine();

        for (int i=0; i < breeds.length - 1; i++) {
            percents[i] = breedPercent.nextInt(percentLeft);
            percentLeft -= percents[i];
        }
        percents[breeds.length - 1] = percentLeft;

        System.out.printf("Well then, I have this highly reliable report on %s's prestigious background right here.%n%n", dogName);
        System.out.printf("%s is:%n%n", dogName);

        for (int i=0; i< breeds.length; i++) {
            System.out.printf("%d%% %s%n", percents[i], breeds[i]);
        }

        System.out.println();
        System.out.println("Wow, that's QUITE the dog!");


    }
}
