package com.sammy.arrays.twoAndMultiDimensional.caseStudies;

import java.util.Arrays;
import java.util.Scanner;

public class SudokuSolutionChecks {
    private static int[][] readASudokuSolution() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] sudoku = new int[9][9];
        Arrays.stream(sudoku)
              .forEach(rows -> Arrays.setAll(rows, column -> userInput.nextInt()));
        /*for(int row = 0; row < 9; row++){
            for(int column = 0; column < 9; column++){
                sudoku[row][column] = userInput.nextInt();
            }
        }*/
        return sudoku;
    }

    private static boolean isValid(int[][] sudoku){
        boolean isSolutionValid = true;

        for(int row = 0; row < 9; row++){
            for(int column = 0; column < 9; column++){
                if(sudoku[row][column] < 1 || sudoku[row][column] > 9 || !isValid(row, column, sudoku)){
                    isSolutionValid = false;
                }
            }
        }
        return isSolutionValid;
    }

    private static boolean isValid(int row, int column, int[][] sudoku) {
        boolean isSudokuSolutionValid = true;
        //Check whether sudoku[row][column] is unique in each row
        for(int currentColumn = 0; currentColumn < 9; currentColumn++){
            if (currentColumn != column && sudoku[row][currentColumn] == sudoku[row][column]) {
                isSudokuSolutionValid = false;
                break;
            }
        }

        //Check whether sudoku[row][column] is unique in each column
        for(int currentRow = 0; currentRow < 9; currentRow++){
            if (currentRow != row && sudoku[currentRow][column] == sudoku[row][column]) {
                isSudokuSolutionValid = false;
                break;
            }
        }

        //Check whether sudoku[row][column] is unique in the 3-by-3 box
        for(int currentRow = (row / 3) * 3; currentRow < (row / 3) * 3 + 3; currentRow++){
            for(int currentColumn = (column / 3) * 3; currentColumn < (column / 3) * 3 + 3; currentColumn++){
                if (!(currentRow == row && currentColumn == column) &&
                    sudoku[currentRow][currentColumn] == sudoku[row][column]) {
                    isSudokuSolutionValid = false;
                    break;
                }
            }
        }

        return isSudokuSolutionValid;
    }

    public static void main(String[] args) {
        int[][] sudokuSolutionGrid = readASudokuSolution();
        System.out.println(isValid(sudokuSolutionGrid) ? "Valid Solution" : "Invalid Solution");
    }
}
