package com.sammy.recursion.caseStudies;

import java.util.Scanner;

public class TowerOfHanoiProblem {
    private static void moveDisksBetweenTowers(int diskNumber, char sourceTower,
                                               char destinationTower, char intermediaryTower){
        if(diskNumber == 1){
            System.out.println("Move disk " + diskNumber + " from " + sourceTower +
                               " to " + destinationTower);
        }else{
            moveDisksBetweenTowers(diskNumber - 1, sourceTower,
                                   intermediaryTower, destinationTower);
            System.out.println("Move disk " + diskNumber + " from " + sourceTower +
                               " to " + destinationTower);
            moveDisksBetweenTowers(diskNumber - 1, intermediaryTower,
                                   destinationTower, sourceTower);
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int numberOfDisks = userInput.nextInt();

        System.out.println(" The moves are: " );
        moveDisksBetweenTowers(numberOfDisks, 'A', 'B', 'C');
    }
}
