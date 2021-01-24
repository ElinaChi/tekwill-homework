package com.tekwill.learning.javaapi.arrays;

import java.util.Scanner;

public class CounterUppercaseLetters {
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String newWord = scanner.nextLine();
        System.out.print("The number of upper case is " + bigNUmber(newWord));
    }

    private static int bigNUmber(String newWord) {
        int bigLetter = 0;

        int letters = newWord.length();
        for (int i = 0; i < letters; i++) {
            if (newWord.charAt(i) >= 'A' && newWord.charAt(i) <= 'Z') {
                bigLetter++;
            }
        }
        return bigLetter;
    }
}





