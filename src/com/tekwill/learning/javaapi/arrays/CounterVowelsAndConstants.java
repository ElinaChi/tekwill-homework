package com.tekwill.learning.javaapi.arrays;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class CounterVowelsAndConstants {
    public static void main(String[] args) {
        System.out.print("Enter a string ");
        Scanner scanner = new Scanner(System.in);

        String newString = scanner.next().toLowerCase();

        int vowels = 0; int consonants = 0;
        for (int i = 0; i < newString.length(); i++) {
            if (newString.charAt(i) == 'a' || newString.charAt(i) == 'u' || newString.charAt(i) == 'o' || newString.charAt(i) == 'i' || newString.charAt(i) == 'e') {
                vowels++;
            }
            else consonants++;
        }

        System.out.println("The number of vowels are "+ vowels);
        System.out.println("The number of consonants are "+ consonants);

    }
}






