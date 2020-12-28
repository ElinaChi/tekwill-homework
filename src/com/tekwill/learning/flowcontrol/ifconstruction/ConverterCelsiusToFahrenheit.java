package com.tekwill.learning.flowcontrol.ifconstruction;

import java.util.Scanner;

public class ConverterCelsiusToFahrenheit {
    public static void main (String args []){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a degree in Celsius: \n");
        double celsiusDegree = scanner.nextDouble();
        System.out.println(celsiusDegree +" \b Celsius is " + ((9.0 / 5) * celsiusDegree + 32)+ " \b Fahrenheit");



    }

}
