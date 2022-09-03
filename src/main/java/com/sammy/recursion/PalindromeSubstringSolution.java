package com.sammy.recursion;

public class PalindromeSubstringSolution {
    private static boolean isPalindrome(String word){

        return isPalindrome(word, 0, word.length() - 1);
    }

    private static boolean isPalindrome(String word, int startPoint, int endPoint) {
        boolean isWordPalindrome;
        if(endPoint <= startPoint){
            isWordPalindrome = true;
        }else if(word.charAt(startPoint) != word.charAt(endPoint)){
            isWordPalindrome = false;
        }else{
            isWordPalindrome = isPalindrome(word, startPoint + 1, endPoint - 1);
        }
        return isWordPalindrome;
    }

    public static void main(String[] args) {
        System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
        System.out.println("Is noon a palindrome? " + isPalindrome("noon"));
        System.out.println("Is a a palindrome? " + isPalindrome("a"));
        System.out.println("Is aba a palindrome? " + isPalindrome("aba"));
        System.out.println("Is ab a palindrome? " + isPalindrome("ab"));
    }
}
