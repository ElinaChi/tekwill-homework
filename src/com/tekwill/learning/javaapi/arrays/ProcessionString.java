package com.tekwill.learning.javaapi.arrays;

import java.util.Scanner;

public class ProcessionString {
    public static void main(String[] args) {

        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String newWord = scanner.next();

        //display character at odd position
        int counter;
        for (counter = 0; counter < newWord.length(); counter++) {

            if (counter % 2 != 0);

                System.out.print(newWord.charAt(counter));

        }

    }
}
