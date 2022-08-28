package com.sammy.arrays.singleDimensional.caseStudies;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int arraySize = userInput.nextInt();

        double[] numbers = new double[arraySize];

        System.out.println("Enter the numbers: ");
        Arrays.setAll(numbers, index -> userInput.nextDouble());
        double numbersAverage = Arrays.stream(numbers).average().orElse(Double.NaN);

        long count = IntStream.rangeClosed(0, arraySize - 1)
                              .filter(index -> numbers[index] > numbersAverage)
                              .count();

        System.out.println("Average is " + numbersAverage);
        System.out.println("Number of elements above the average is: " + count);
    }
}
