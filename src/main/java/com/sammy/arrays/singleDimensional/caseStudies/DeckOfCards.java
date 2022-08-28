package com.sammy.arrays.singleDimensional.caseStudies;

import java.util.Arrays;

public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
        String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

        Arrays.setAll(deck, index -> index);
        //Shuffle the cards & display random 4 cards
        for(int index = 0; index < 4; index++){
            int cardNumber = (int) (Math.random() * deck.length);
            String suit = suits[cardNumber / 13];
            String rank = ranks[cardNumber % 13];
            System.out.println("Card number " + cardNumber + ": " + rank + " of " + suit);
        }
    }
}
