package com.sammy.searches;

import java.util.Arrays;

public class BinarySearchArray {
    private static int performBinarySearchForValueIndex(int[] numbers, int value){
        int startPoint = 0;
        int endPoint = numbers.length - 1;

        while(endPoint >= startPoint){
            int middle = (startPoint + endPoint) / 2;
            if(value > numbers[middle]){
                startPoint = middle + 1;
            }else if(value < numbers[middle]){
                endPoint = middle - 1;
            }else{
                return middle;
            }
        }

        return -1;
    }

    private static int performBinarySearchForValueIndexUsingArrays(int[] numbers, int value){
        return Arrays.binarySearch(numbers, value);
    }

    private static int performBinarySearchForValueIndexUsingArrays(char[] numbers, char value){
        return Arrays.binarySearch(numbers, value);
    }

    public static void main(String[] args) {
        int[] unsortedNumbers = {1, 4, 4, 2, 5, -3, 6, 2};
        int[] sortedNumbers = {2, 4, 7, 10, 11, 45, 50, 59, 60, 69, 70, 79};
        char[] characters = {'a', 'c', 'g', 'x', 'y', 'z'};
        System.out.println("Index of value searched: " + performBinarySearchForValueIndex(unsortedNumbers, 4));
        System.out.println("Index of value searched: " + performBinarySearchForValueIndex(unsortedNumbers, 1));
        System.out.println("Index of value searched: " + performBinarySearchForValueIndexUsingArrays(sortedNumbers, 2));
        System.out.println("Index of value searched: " + performBinarySearchForValueIndexUsingArrays(sortedNumbers, 12));
        System.out.println("Index of value searched: " + performBinarySearchForValueIndex(sortedNumbers, 11));
        System.out.println("Index of value searched: " + performBinarySearchForValueIndex(sortedNumbers, 69));

        System.out.println("Index of char value: " + performBinarySearchForValueIndexUsingArrays(characters, 'c'));
        System.out.println("Index of char value: " + performBinarySearchForValueIndexUsingArrays(characters, 'z'));
    }
}
