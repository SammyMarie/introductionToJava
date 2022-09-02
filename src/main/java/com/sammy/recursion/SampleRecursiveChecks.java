package com.sammy.recursion;

public class SampleRecursiveChecks {
    private static void someMethod(int number){
        if(number > 0){
            someMethod(number - 1);
            System.out.println(number + " ");
        }
    }

    private static void printMessage(String message, int times){
        if(times >= 0){
            System.out.println(message + times);
            printMessage(message, times - 1);
        }
    }

    public static void main(String[] args) {
        someMethod(5);
        System.out.println();
        printMessage("This has been printed ", 5);
    }
}
