package com.tekwill.learning.flowcontrol.ifconstruction;

import java.util.Scanner;

public class VowelOrConstant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter :");

        String letter = scanner.nextLine();
        switch (letter) {
            case "A":
            case "a":
            case "O":
            case "o":
            case "U":
            case "u":
            case "I":
            case "i":
            case "E":
            case "e": System.out.println(letter + " is a Vowel");
             break;
            case "B":
            case "C":
            case "D":
            case "F":
            case "G":
            case "H":
            case "J":
            case "K":
            case "L":
            case "M":
            case "N":
            case "P":
            case "Q":
            case "R":
            case "S":
            case "V":
            case "W":
            case "X":
            case "Z": System.out.println(letter + " is a Consonant");
               break;
            default: System.out.println (letter+ " Invalid input");

        }
    }
}

