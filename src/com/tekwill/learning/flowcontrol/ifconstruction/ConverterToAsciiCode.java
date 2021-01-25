package com.tekwill.learning.flowcontrol.ifconstruction;


import java.util.Scanner;

public class ConverterToAsciiCode {
    public static void main (String[] args){
        System.out.print("Enter an ASCII code: \n");
        Scanner scanner = new Scanner (System.in);
        int asciiCharacter = scanner.nextInt();
        System.out.println((char)asciiCharacter);

    }
    }
