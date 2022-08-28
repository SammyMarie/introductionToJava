package com.sammy.arrays.singleDimensional;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class ProcessingArrayElements {
    private static void findLargestElementInArray(){
        double[] numbers = loadArray();

        double max = numbers[0];
        /*for(int index = 1; index < numbers.length; index++){
            if(numbers[index] > max){
                max = numbers[index];
            }
        }*/

        max = Arrays.stream(numbers).max().getAsDouble();

        Arrays.stream(numbers).forEach(System.out::println);
        System.out.println("Largest array element is: " + max);
    }

    private static int smallestIndexForLargestNumber(){
        double[] numbers = {1, 5, 3, 4, 5, 5};
        int indexOfMax = 0;
        double max = numbers[0];
        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] > max){
                max = numbers[index];
                indexOfMax = index;
            }
        }
        return indexOfMax;
    }

    private static void shufflingArrayElements(){
        double[] numbers = loadArray();
        Arrays.stream(numbers).forEach(System.out::println);
        System.out.println();
        for(int index = 0; index < numbers.length - 1; index++){
            //Generate a random index j
            int secondIndex = (int) (Math.random() * numbers.length);
            //Swap number[index] to numbers[secondIndex]
            double temp = numbers[index];
            numbers[index] = numbers[secondIndex];
            numbers[secondIndex] = temp;
        }

        Arrays.stream(numbers).forEach(System.out::println);
    }

    private static void shiftingArrayElementsToTheLeft(){
        double[] numbers = loadArray();
        System.out.println("Initial array elements: " );
        Arrays.stream(numbers).forEach(System.out::println);

        double temp = numbers[0];
        for(int index = 1; index < numbers.length; index++){
            numbers[index - 1] = numbers[index];

        }

        numbers[numbers.length - 1] = temp;
        System.out.println();
        System.out.println("Shifted array elements: ");
        Arrays.stream(numbers).forEach(System.out::println);
    }

    private static void findCalendarMonth(Scanner userInput){
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        System.out.println("Enter a month number (1 to 12): ");
        int monthNumber = userInput.nextInt();
        System.out.println("The month is " + months[monthNumber - 1]);
    }

    public static void main(String[] args) {
        findLargestElementInArray();
        System.out.println();
        System.out.println("Smallest index: " + smallestIndexForLargestNumber());
        System.out.println();
        shufflingArrayElements();
        System.out.println();
        shiftingArrayElementsToTheLeft();

        Scanner userInput = new Scanner(System.in);
        findCalendarMonth(userInput);
    }

    private static double[] loadArray() {
        return DoubleStream.generate(() -> Math.random() * 100)
                           .limit(11)
                           .toArray();
    }
}
