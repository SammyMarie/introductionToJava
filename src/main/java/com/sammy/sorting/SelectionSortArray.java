package com.sammy.sorting;

import java.util.Arrays;

public class SelectionSortArray {
    private static void selectionSort(double[] numbers){
        for(int index = 0; index < numbers.length - 1; index++){
            //Find smallest element in array
            double currentMinimum = numbers[index];
            int currentMinimumIndex = index;

            for(int secondIndex = index + 1; secondIndex < numbers.length; secondIndex++){
                if(currentMinimum > numbers[secondIndex]){
                    currentMinimum = numbers[secondIndex];
                    currentMinimumIndex = secondIndex;
                }
            }
            //Swap value at index with value at currentMinimumIndex
            if(currentMinimumIndex != index){
                numbers[currentMinimumIndex] = numbers[index];
                numbers[index] = currentMinimum;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void secondSortUsingArrays(double[] numbers){
        Arrays.sort(numbers);
        Arrays.parallelSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        double[] numbers = {1, 9, 4.5, 6.6, 5.7, -4.5};
        double[] secondNumbers = {3.4, 5, 3, 3.5, 2.2, 1.9, 2};
        //selectionSort(numbers);
        selectionSort(secondNumbers);
        secondSortUsingArrays(numbers);
    }
}
