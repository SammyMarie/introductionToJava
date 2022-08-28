package com.sammy.arrays.singleDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInitializationStylesAndDisplay {
    private static double[] numbers;

    private static void oneInitializationStyle(double[] numbers){
        numbers[0] = 5.6;
        numbers[1] = 4.5;
        numbers[2] = 3.3;
        numbers[3] = 13.2;
        numbers[4] = 4.0;
        numbers[5] = 34.33;
        numbers[6] = 34.0;
        numbers[7] = 45.45;
        numbers[8] = 99.993;
        numbers[9] = 11123;
    }

    private static void secondInitializationStyle(){
        double[] mySecondList = new double[11];
        for(int index = 0; index < mySecondList.length; index++){
            mySecondList[index] = index;
        }
    }

    private static void initializerStyle(){
        double[] thirdList = { 1.9, 2.9, 3.4, 3.5 };
    }

    private static void initializeWithRandomValuesAndSum(){
        numbers = new double[11];
        for(int index = 0; index < numbers.length; index++){
            numbers[index] = Math.random() * 100; //Adds numbers between 0 to less than 100.0
        }

        Arrays.stream(numbers).forEach(System.out::println);

        /*double sums = 0;
        for(int index = 0; index < numbers.length; index++){
            sums += numbers[index];
        }*/

        double sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of array elements is: " + sum);
    }

    private static void userInputArrayValues(double[] numbers, Scanner userInput){
        for(int index = 0; index < numbers.length; index++){
            numbers[index] = userInput.nextDouble();
        }

        Arrays.stream(numbers).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        numbers = new double[10];

        oneInitializationStyle(numbers);

        System.out.println("Enter " + numbers.length + " values: ");
        userInputArrayValues(numbers, userInput);
        System.out.println();

        initializeWithRandomValuesAndSum();
    }
}
