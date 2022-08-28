package com.sammy.arrays.singleDimensional.caseStudies;

import java.util.Arrays;

public class ArrayCopy {
    private static void copyWithForLoop(){
        int[] sourceArray = {2, 3, 1, 4, 5, 10};
        int[] targetArray = new int[sourceArray.length];
        for(int index = 0; index < sourceArray.length; index++){
            targetArray[index] = sourceArray[index];
        }

        Arrays.stream(targetArray).forEach(System.out::println);
    }

    private static void copyWithSystemCopy(){
        int[] source = {3, 4, 5};
        int[] target = new int[source.length];
        System.arraycopy(source, 0, target, 0, source.length);

        Arrays.stream(target).forEach(System.out::println);
    }

    public static void main(String[] args) {
        copyWithForLoop();
        System.out.println();
        copyWithSystemCopy();
    }
}
