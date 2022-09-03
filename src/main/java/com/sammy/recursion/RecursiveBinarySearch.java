package com.sammy.recursion;

public class RecursiveBinarySearch {
    private static int binarySearch(int[] numbers, int valueToSearch){
        int startPoint = 0;
        int endPoint = numbers.length - 1;

        return binarySearch(numbers, valueToSearch, startPoint, endPoint);
    }

    private static int binarySearch(int[] numbers, int valueToSearch, int startPoint, int endPoint) {
        int outcome;
        if(startPoint > endPoint){
            outcome = -startPoint - 1;
        }
        int middle = (startPoint + endPoint) / 2;
        if(valueToSearch < numbers[middle]){
            outcome = binarySearch(numbers, valueToSearch, startPoint, middle - 1);
        }else if(valueToSearch == numbers[middle]){
            outcome = middle;
        }else{
            outcome = binarySearch(numbers, valueToSearch, middle + 1, endPoint);
        }

        return outcome;
    }

    public static void main(String[] args) {
        int[] unsortedNumbers = {1, 4, 4, 2, 5, -3, 6, 2};
        int[] sortedNumbers = {2, 4, 7, 10, 11, 45, 50, 59, 60, 69, 70, 79};
        System.out.println("Index of value searched: " + binarySearch(sortedNumbers, 60));
    }
}
