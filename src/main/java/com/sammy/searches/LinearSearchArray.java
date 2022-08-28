package com.sammy.searches;

import java.util.stream.IntStream;

public class LinearSearchArray {
    private static int performValueSearchLinearly(int[] numbers, int key){
        int value = 0;
        if(key <= numbers.length - 1 && !(key < 0)){
            value = numbers[key];
        }

        return value;
    }

    private static int performKeySearchLinearly(int[] numbers, int value){

        return IntStream.range(0, numbers.length)
                        .filter(index -> value == numbers[index])
                        .findFirst()
                        .orElse(-1);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 4, 4, 2, 5, -3, 6, 2};
        System.out.println("Index of value searched: " + performKeySearchLinearly(numbers, 4));
        System.out.println("Index of value searched: " + performKeySearchLinearly(numbers, -4));
        System.out.println("Index of value searched: " + performKeySearchLinearly(numbers, -3));
        System.out.println("Index of value searched: " + performKeySearchLinearly(numbers, 2));
        System.out.println();
        System.out.println("Value at index: " + performValueSearchLinearly(numbers, 7));
    }
}
