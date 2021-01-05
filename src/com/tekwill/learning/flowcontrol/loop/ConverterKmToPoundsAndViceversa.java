package com.tekwill.learning.flowcontrol.loop;

public class ConverterKmToPoundsAndViceversa{
    public static void main (String []args){
    System.out.printf("%10s %10s  |   %5s %10s\n", "Kilograms" ,"Pounds","Pounds", "Kilograms");

        float oneKgInPound = 2.2f;
        int pound = 15;
        for (int kg = 1; kg <= 199; kg = kg + 2) {
            System.out.printf("%10d %10.2f   |  %5d %10.2f \n", kg, oneKgInPound * kg, pound+=5,pound/oneKgInPound);

    }
    }
}

