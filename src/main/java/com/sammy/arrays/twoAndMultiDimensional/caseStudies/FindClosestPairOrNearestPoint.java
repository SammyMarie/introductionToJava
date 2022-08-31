package com.sammy.arrays.twoAndMultiDimensional.caseStudies;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FindClosestPairOrNearestPoint {
    private static double distance(double firstX_Axis, double firstY_Axis, double secondX_Axis, double secondY_Axis) {
        return Math.sqrt((secondX_Axis - firstX_Axis) * (secondX_Axis - firstX_Axis) +
                         (secondY_Axis - firstY_Axis) * (secondY_Axis - firstY_Axis));
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number of points: ");

        int numberOfPoints = userInput.nextInt();
        double[][] graphPoints = new double[numberOfPoints][2];
        int firstPoint = 0, secondPoint = 1;
        System.out.print("Enter " + numberOfPoints + " points: ");
        IntStream.range(0, graphPoints.length)
                 .forEach(index -> {
                     graphPoints[index][0] = userInput.nextDouble();
                     graphPoints[index][1] = userInput.nextDouble();
                 });

        double shortestDistance = distance(graphPoints[firstPoint][0], graphPoints[firstPoint][1],
                                           graphPoints[secondPoint][0], graphPoints[secondPoint][1]);

        for(int row = 0; row < graphPoints.length; row++){
            for(int column = row + 1; column < graphPoints.length; column++){
                double pointsDistance = distance(graphPoints[row][0], graphPoints[row][1],
                                                 graphPoints[column][0], graphPoints[column][0]);

                if(shortestDistance > pointsDistance){
                    firstPoint = row;
                    secondPoint = column;
                    shortestDistance = pointsDistance;
                }
            }
        }

        System.out.println("The closest two points are: " + "(" +
                           graphPoints[firstPoint][0] + ", " + graphPoints[firstPoint][1]
                          + ") and (" + graphPoints[secondPoint][0] + ", " + graphPoints[secondPoint][1] + ")");
    }
}
