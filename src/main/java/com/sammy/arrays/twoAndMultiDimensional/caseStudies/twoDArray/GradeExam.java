package com.sammy.arrays.twoAndMultiDimensional.caseStudies.twoDArray;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeExam {
    public static void checkMagazine(List<String> magazine, List<String> notes) {
        Map<String, Integer> magazineWords = new HashMap<>();

        magazine.forEach(word -> {
            if (magazineWords.containsKey(word)) {
                magazineWords.put(word, magazineWords.get(word) + 1);
            } else {
                magazineWords.put(word, 1);
            }
        });

        for(String ransomWord : notes) {
            if (magazineWords.containsKey(ransomWord) &&
                magazineWords.get(ransomWord) != 0) {
                magazineWords.put(ransomWord, magazineWords.get(ransomWord) - 1);
            } else {
                System.out.println("No");
                return;
            }
        }

        System.out.print("Yes");
    }


    public static void main(String[] args) {
        char[][] answers = {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        for (int index = 0; index < answers.length; index++) {
            int correctCount = 0; //To grade one Student
            for (int secondIndex = 0; secondIndex < answers[index].length; secondIndex++) {
                if (answers[index][secondIndex] == keys[secondIndex]) {
                    correctCount++;
                }
            }

            System.out.println("Student " + index + "'s correct count is " + correctCount);
        }
    }
}
