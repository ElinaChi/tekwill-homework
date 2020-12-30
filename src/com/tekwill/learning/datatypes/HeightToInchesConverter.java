package com.tekwill.learning.datatypes;

import java.util.Scanner;

public class HeightToInchesConverter {
    public static void main(String[] args) {
        System.out.print("Enter your height in inches: \n");
        Scanner scanner = new Scanner(System.in);
        int yourHeight = scanner.nextInt();
// feet =12 inches
        int inFeets = yourHeight/12 ;
        int remainingInInches = yourHeight % 12;

        System.out.println("Your Height in feets are:" + inFeets);
        System.out.print("Remaining inches are:" + remainingInInches );




    }
}
