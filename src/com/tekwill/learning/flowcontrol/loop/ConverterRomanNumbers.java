package com.tekwill.learning.flowcontrol.loop;

import java.util.Scanner;

public class ConverterRomanNumbers {
    public static void main (String  [] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number within the range of 1 to 10: ");
        int number = scanner.nextInt();

        switch (number){
            case 1:   System.out.print("The corresponding Roman number is: I");
             break;
            case 2:   System.out.print("The corresponding Roman number is: II");
                break;
            case 3:   System.out.print("The corresponding Roman number is: III");
                break;
            case 4:   System.out.print("The corresponding Roman number is: IV");
                break;
            case 5:   System.out.print("The corresponding Roman number is: V");
                break;
            case 6:   System.out.print("The corresponding Roman number is: VI");
                break;
            case 7:   System.out.print("The corresponding Roman number is: VII");
                break;
            case 8:   System.out.print("The corresponding Roman number is: VIII");
                break;
            case 9:   System.out.print("The corresponding Roman number is: IX");
                break;
            case 10:   System.out.printf("The corresponding Roman number is: %010f");
                break;
            default: System.out.println ("Compilation Error");
        }


    }
}
//1=I; 2=1+1;3= 1+1+1;
//4=IV;
//5= V; 6= 5+1; 7= 5+1+1; 8=5+1+1+1;
//9=IX;
//10=X
