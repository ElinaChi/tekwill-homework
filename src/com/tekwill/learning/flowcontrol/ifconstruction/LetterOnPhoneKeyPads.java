package com.tekwill.learning.flowcontrol.ifconstruction;

import java.util.Scanner;

public class LetterOnPhoneKeyPads {
    public static void main (String args []){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a letter: ");
        String letter = scanner.nextLine();

        switch (letter){
            case "A":
            case "a":
            case "B":
            case "b":
            case "C":
            case "c": System.out.print("The corresponding number is: 2");
            break;
            case "D":
            case "d":
            case "E":
            case "e":
            case "F":
            case "f": System.out.print("The corresponding number is: 3");
                break;
            case "G":
            case "g":
            case "H":
            case "h":
            case "I":
            case "i": System.out.print("The corresponding number is: 4");
                break;
            case "J":
            case "j":
            case "K":
            case "k":
            case "L":
            case "l": System.out.print("The corresponding number is: 5");
                break;
            case "M":
            case "m":
            case "N":
            case "n":
            case "O":
            case "o": System.out.print("The corresponding number is: 6");
                break;
            case "P":
            case "p":
            case "Q":
            case "q":
            case "R":
            case "r":
            case "S":
            case "s": System.out.print("The corresponding number is: 7");
                break;
            case "T":
            case "t":
            case "U":
            case "u":
            case "V":
            case "v": System.out.print("The corresponding number is: 8");
                break;
            case "W":
            case "w":
            case "X":
            case "x":
            case "Y":
            case "y":
            case "Z":
            case "z":System.out.print("The corresponding number is: 9");
                break;
        }
    }
}
