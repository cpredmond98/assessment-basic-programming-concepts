package com.sg.foundations.cumulativeExercises;

public class SummativeSums {

    public static void main(String[] args) {

        int[][] arrs = {
                { 1, 90, -33, -55, 67, -16, 28, -55, 15 },
                { 999, -60, -77, 14, 160, 301 },
                { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                        140, 150, 160, 170, 180, 190, 200, -99 }
        };
        int i = 1;
        for (int[] arr : arrs) {
            System.out.println("#" + i + " Array Sum: " + sumArray(arr));
            i++;
        }
    }

    private static int sumArray(int[] arrIn) {

        int sum = 0;

        for (int i : arrIn) {
            sum += i;
        }

        return sum;
    }
}
