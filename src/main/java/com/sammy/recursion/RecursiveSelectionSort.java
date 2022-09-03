package com.sammy.recursion;

import java.util.Arrays;

public class RecursiveSelectionSort {
    private static void selectSort(double[] numbers){
        selectSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));
    }

    private static void selectSort(double[] numbers, int startPoint, int endPoint) {
        if(startPoint < endPoint){
            int indexOfMinimum = startPoint;
            double minimum = numbers[startPoint];
            for(int index = startPoint + 1; index <= endPoint; index++){
                if(numbers[index] < minimum){
                    minimum = numbers[index];
                    indexOfMinimum = index;
                }
            }

            //Swap the smallest in numbers[startPoint .. endPoint] with numbers[startPoint]
            numbers[indexOfMinimum] = numbers[startPoint];
            numbers[startPoint] = minimum;
            selectSort(numbers, startPoint + 1, endPoint);
        }
    }

    public static void main(String[] args) {

        selectSort(new double[]{15, 10, 9, 4, 3, 2, 1, 8});
    }
}
