package com.tekwill.learning.javaapi.arrays;

import java.util.Scanner;

public class ReversionString {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String wordToReverse = scanner.next();


        int letters = wordToReverse.length();
        char[] charOriginal = new char[letters];
        char[] charReverse = new char[letters];

        //original string in char

        for (int index = 0; index < letters; index++) {
            charOriginal[index] = wordToReverse.charAt(index);

        }
        // reverse
        for (int j = 0; j < letters; j++) {
            charReverse[j] = charOriginal[letters - 1 - j];
        }
        String reverseString = new String(charReverse);

        //System.out.println(charOriginal);
        System.out.print("The reversed string is " + reverseString);
    }


}






