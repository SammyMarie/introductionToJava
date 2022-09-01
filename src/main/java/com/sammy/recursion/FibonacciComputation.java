package com.sammy.recursion;

import java.util.Scanner;

public class FibonacciComputation {
    private static long computeFibonacciSeries(long index){
        long series;

        if(index == 0){
            series = 0;
        }else if(index == 1){
            series = 1;
        }else{
            series = computeFibonacciSeries(index - 1) + computeFibonacciSeries(index - 2);
        }

        return series;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter an index for a Fibonacci number: ");

        int index = userInput.nextInt();
        System.out.println("The Fibonacci number at index " + index + " is " + computeFibonacciSeries(index));
    }
}
