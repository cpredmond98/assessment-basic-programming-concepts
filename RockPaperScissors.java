package com.sg.foundations.cumulativeExercises;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int ties, cWin, pWin, outcome, keepPlaying, numRounds, playerThrow;
        Random computerThrow = new Random();

        keepPlaying = 1;

        while (keepPlaying == 1) {

            // instantiate flow control and game mechanics variables
            ties = 0;
            cWin = 0;
            pWin = 0;

            System.out.print("How many rounds would you like to play? ");
            numRounds = scan.nextInt();

            if (numRounds >= 1 && numRounds <= 10) {

                // loop through rounds
                for (int i = 0; i < numRounds; i++) {

                    // get player instruction
                    playerThrow = -1;
                    while (playerThrow != 0 && playerThrow != 1 && playerThrow != 2) {
                        System.out.println("Rock, paper, scissors, shoot...\n\t0 - Rock\n\t1 - Paper\n\t2 - Scissors");
                        playerThrow = scan.nextInt();
                    }

                    // find match winner
                    outcome = (playerThrow - computerThrow.nextInt(4) + 3) % 3;
                    if (outcome == 0) {
                        System.out.println("Tie!\n");
                        ties++;
                    } else if (outcome == 1) {
                        System.out.println("You win! There is hope for humanity!\n");
                        pWin++;
                    } else {
                        System.out.println("Computer wins! The machines will dominate all!\n");
                        cWin++;
                    }
                }

                // report game score
                System.out.printf("Overall:%n%-15s%4d%n%-15s%4d%n%-15s%4d%n%n",
                        "Ties:", ties, "Your wins:", pWin, "Computer wins:", cWin);

                //play again?
                keepPlaying = -1;
                while (keepPlaying != 1 && keepPlaying != 0) {
                    System.out.println("Would you like to play again?\n\t1 - yes\n\t0 - no");
                    keepPlaying = scan.nextInt();
                }

                if (keepPlaying == 0) {
                    System.out.println("Thanks for playing!");
                }


            }

            // exit with error
            else {
                System.out.println("Number outside accepted range...");
                keepPlaying = 0;
            }

        }

    }
}
