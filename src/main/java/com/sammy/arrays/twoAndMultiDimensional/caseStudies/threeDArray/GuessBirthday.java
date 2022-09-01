package com.sammy.arrays.twoAndMultiDimensional.caseStudies.threeDArray;

import java.util.Scanner;

public class GuessBirthday {
    public static void main(String[] args) {
        int day = 0; //Day to be determined
        int answer;

        int[][][] dates = {
                {{1, 3, 5, 7},
                 {9, 11, 13, 15},
                 {17, 19, 21, 23},
                 {25, 27, 29, 31}},
                {{2, 3, 6, 7},
                 {10, 11, 14, 15},
                 {18, 19, 22, 23},
                 {26, 27, 30, 31}},
                {{4, 5, 6, 7},
                 {12, 13, 14, 15},
                 {20, 21, 22, 23},
                 {28, 29, 30, 31}},
                {{8, 9, 10, 11},
                 {12, 13, 14, 15},
                 {24, 25, 26, 27},
                 {28, 29, 30, 31}},
                {{16, 17, 18, 19},
                 {20, 21, 22, 23},
                 {24, 25, 26, 27},
                 {28, 29, 30, 31}}
        };

        Scanner userInput = new Scanner(System.in);

        for(int index = 0; index < 5; index++){
            System.out.println("Is your birthday in Set" + (index + 1) + "?");
            for(int secondIndex = 0; secondIndex < 4; secondIndex++){
                for(int thirdIndex = 0; thirdIndex < 4; thirdIndex++){
                    System.out.printf("%4d", dates[index][secondIndex][thirdIndex]);
                }
                System.out.println();
            }
            System.out.println("\nEnter 0 for No and 1 for Yes: ");
            answer = userInput.nextInt();
            if(answer == 1){
                day += dates[index][0][0];
            }
        }
        System.out.println("Your birthday is " + day);
    }
}
