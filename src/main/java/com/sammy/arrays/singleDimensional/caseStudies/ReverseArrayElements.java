package com.sammy.arrays.singleDimensional.caseStudies;

import java.util.Arrays;

public class ReverseArrayElements {
    private static int[] reverse(int[] numbers){
        int[] reserved = new int[numbers.length];
        for(int index = 0; index < numbers.length; index++){
            int newIndex = numbers.length - index - 1;
            reserved[index] = numbers[newIndex];
        }

        return reserved;
    }

    private static int[] secondReverse(int[] numbers){
        for(int index = 0; index < numbers.length / 2; index++){
            int tempValue = numbers[index];
            int newIndex = numbers.length - index - 1;

            numbers[index] = numbers[newIndex];

            numbers[newIndex] = tempValue;
        }

        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        //Arrays.stream(secondReverse(numbers)).forEach(System.out::print);
        Arrays.stream(reverse(numbers)).forEach(System.out::print);
    }
}
