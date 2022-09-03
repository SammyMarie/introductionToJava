package com.sammy.arrays.singleDimensional.caseStudies;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class CountLetterFrequency {
    private static char retrieveRandomCharacters(){
        return (char) ('a' + Math.random() * ('z' - 'a' + 1));
    }

    private static char[] createAndLoadLetters() {
        char[] letters = new char[100];
        for(int index = 0; index < letters.length; index++){
            letters[index] = Character.toLowerCase(retrieveRandomCharacters());
        }
        return letters;
    }

    private static Map<Character, Integer> countLetters(char[] characters){
        Map<Character, Integer> lettersAndFrequency = new HashMap<>();

        IntStream.range(0, characters.length)
                 .forEach(index -> {
                     if(lettersAndFrequency.containsKey(characters[index])){
                         lettersAndFrequency.put(characters[index], lettersAndFrequency.get(characters[index]) + 1);
                     }else{
                         lettersAndFrequency.put(characters[index], 1);
                     }
                 });

        return lettersAndFrequency;
    }

    private static void displayLetters(char[] letters) {
        for(int index = 0; index < letters.length; index++){
            if((index + 1) % 20 == 0){
                System.out.println(letters[index]);
            }else{
                System.out.print(letters[index] + " ");
            }
        }
    }

    private static void displayLetterCount(Map<Character, Integer> lettersAndFrequency){
        Character maxOccurrences = Collections.max(lettersAndFrequency.entrySet(),
                                                   Comparator.comparingInt(Map.Entry::getValue))
                                              .getKey();

        lettersAndFrequency.forEach((key, value) -> System.out.println(key + " occurs " + value + " times "));
        System.out.println("One with most occurrences " + maxOccurrences);
    }

    public static void main(String[] args) {
        char[] letters = createAndLoadLetters();

        System.out.println("The lower case letters are: ");
        displayLetters(letters);

        Map<Character, Integer> lettersAndFrequency = countLetters(letters);
        System.out.println();
        System.out.println("The occurrences of each letter are: ");
        displayLetterCount(lettersAndFrequency);
    }
}
