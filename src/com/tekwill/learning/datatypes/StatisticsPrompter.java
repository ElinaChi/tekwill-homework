package com.tekwill.learning.datatypes;

import java.util.Scanner;

public class StatisticsPrompter {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the World Population 2020?");
        int integerReadKeyboard = scanner.nextInt();
        System.out.println("The current world population is \b "+ integerReadKeyboard);

        System.out.println("What's the growth rate of a population?");
        float floatReadKeyboard = scanner.nextFloat();
        System.out.println("The currently (2020) growing at a rate of \b "+ floatReadKeyboard+"% per years");

        String stringReadFromKeyboard = scanner.nextLine();
        System.out.println("Source 1: World Population Prospect the 2019 Revision - United Nations, Departament of Economic and Social Affairs, Population Division (2019, June)");

        String stringReadFromKeyboard2 = scanner.nextLine();
        System.out.println("Source 2: International Programs Center at the U.S. Census Bureau. Population Division");

    }
}
