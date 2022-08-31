package com.sammy.arrays.twoAndMultiDimensional;

import java.util.Arrays;

import static com.sammy.arrays.twoAndMultiDimensional.Load2DArray.randomlyPopulate2DArray;

public class Processing2DArrayElements {
    private static int sumAllElements(int[][] matrix){
       int[][] table = randomlyPopulate2DArray(matrix);
        System.out.println();

        return Arrays.stream(table)
                      .flatMapToInt(Arrays::stream).sum();
    }

    private static void sumOfColumnElements(int[][] matrix){
        int[][] table = randomlyPopulate2DArray(matrix);
        System.out.println();
        for(int column = 0; column < table[0].length; column++){
            int total = 0;
            for (int[] numbers : matrix) {
                total += numbers[column];
                System.out.println("Sum for column " + column + " is " + total);
            }
        }
    }

    private static void largestSumInRow(int[][] matrix){
        int maxRow = 0;
        int indexOfMaxRow = 0;

        //Get Sum of first row
        for(int column = 0; column < matrix[0].length; column++){
            maxRow += matrix[0][column];
        }

        for(int row = 0; row < matrix.length; row++){
            int totalOfThisRow = 0;
            for(int column = 0; column < matrix[row].length; column++){
                totalOfThisRow += matrix[row][column];
            }
            if(totalOfThisRow > maxRow){
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }

        System.out.println("Row " + indexOfMaxRow + " has maximum sum of " + maxRow);
    }

    private static void randomElementsShuffling(int[][] matrix){
        for(int rowIndex = 0; rowIndex < matrix.length; rowIndex++){
            for(int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++){
                int secondRowIndex = (int)(Math.random() * matrix.length);
                int secondColumnIndex = (int)(Math.random() * matrix[rowIndex].length);

                //Swap matrix[rowIndex][columnIndex] with matrix[secondRowIndex][secondColumnIndex]
                int temp = matrix[rowIndex][columnIndex];
                matrix[rowIndex][columnIndex] = matrix[secondRowIndex][secondColumnIndex];
                matrix[secondRowIndex][secondColumnIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[10][20];
        System.out.println("Sum of all matrix elements: " + sumAllElements(matrix));
        //sumOfColumnElements(matrix);
        largestSumInRow(matrix);
    }
}
