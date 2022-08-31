package com.sammy.arrays.twoAndMultiDimensional;

import java.util.Arrays;
import java.util.Optional;

public final class Load2DArray {

    public static int[][] randomlyPopulate2DArray(int[][] matrix) {
        int[][] table = Optional.ofNullable(matrix).orElseGet(() -> new int[10][10]);

        Arrays.stream(table)
              .forEach(rows -> Arrays.setAll(rows, column -> (int) (Math.random() * 100)));

        return table;
    }

    public static void display2DElements(int[][] matrix) {

        Optional.ofNullable(matrix)
                .ifPresent(table -> {
                    for (int[] numbers : table) {
                        for (int number : numbers) {
                            System.out.print(number + " ");
                        }
                        System.out.println();
                    }
                });
    }
}
