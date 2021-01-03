package com.tekwill.learning.flowcontrol.ifconstruction;

import java.util.Scanner;

public class NumbersOfDaysInMonth {
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input month number:\t");
        int monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println( "Total number of days: 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11: System.out.println( "Total number of days: 30");
                break;
            case 2: System.out.println( "Total number of days: 29 or 28");
                break;
            default: System.out.println ("Compilation Error");

    }
}
}

//1,3,5,7,8,10,12--31
//4,6,9,11--30
//28 or 29 --2