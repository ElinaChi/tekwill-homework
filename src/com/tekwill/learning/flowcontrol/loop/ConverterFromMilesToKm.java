package com.tekwill.learning.flowcontrol.loop;

public class ConverterFromMilesToKm {
    public static void main (String []args){
        System.out.printf("%20s %20s \n", "Miles" ,"Kilometers");
         int oneMileInKm = 1609;
         for (int mile = 1; mile <= 10; mile++) {
             System.out.printf("%20d", mile);
             System.out.printf("%20d \n", oneMileInKm * mile);
        }
       }
    }

