package com.sammy.arrays.twoAndMultiDimensional;

import java.util.Arrays;
import java.util.Scanner;

import static com.sammy.arrays.twoAndMultiDimensional.Load2DArray.display2DElements;
import static com.sammy.arrays.twoAndMultiDimensional.Load2DArray.randomlyPopulate2DArray;

public class MultiArrayInitializationAndDisplay {

    private static void createAndLoad2DArray() {
        double[][] distances = {{0, 983, 787, 714, 1375, 967, 1087},
                                {983, 0, 214, 1102, 1763, 1723, 1842},
                                {787, 214, 0, 888, 1549, 1548, 1627},
                                {714, 1102, 888, 0, 661, 781, 810},
                                {1375, 1763, 1549, 661, 0, 1426, 1187},
                                {967, 1723, 1548, 781, 1426, 0, 239},
                                {1087, 1842, 1627, 810, 1187, 239, 0}};

        int[][] matrix = new int[5][5];
        int length = matrix[matrix.length - 1].length;
        System.out.println(length);
        System.out.println(distances.length);
    }

    private static void userInput2DArrayValues(Scanner userInput, int[][] matrix){
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns");
        Arrays.stream(matrix).forEach(rows -> Arrays.setAll(rows, column -> userInput.nextInt()));
        display2DElements(matrix);
    }

    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        createAndLoad2DArray();
        randomlyPopulate2DArray(matrix);

        /*Scanner userInput = new Scanner(System.in);
        userInput2DArrayValues(userInput, matrix);*/
    }
}
