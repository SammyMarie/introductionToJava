package com.sammy.recursion;

import java.util.Scanner;

public class FactorialComputation {
    private static long computeFactorial(int number){
        return computeFactorial(number, 1);
    }

    private static long computeFactorial(int number, int result){
        long factorial;
        if(number == 0){
            factorial = result;
        }else{
            factorial = computeFactorial(number - 1, number * result);
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        var number = userInput.nextInt();

        System.out.println("Factorial of " + number + " is " + computeFactorial(number));
    }
}
