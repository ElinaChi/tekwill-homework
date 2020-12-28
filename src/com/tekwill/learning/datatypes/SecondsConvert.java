package com.tekwill.learning.datatypes;
import java.util.Scanner;

public class SecondsConvert {
    public static final int HOUR_IN_DAY = 24;
    public static final int MINUTE_IN_HOUR  = 60;
    public static final int SECONDS_IN_MINUTE = 60;

    //public static void main (String[]args){
//        System.out.println ("Enter the number of seconds: ");
//        System.out.println(numberOfDays(seconds));






    public static long numberOfDays(long seconds){
        long result = (seconds / (HOUR_IN_DAY * MINUTE_IN_HOUR * SECONDS_IN_MINUTE));
        return result;
    }

//    public static int numberOfHours (long seconds){
//                long result2 = (seconds %(HOUR_IN_DAY * MINUTE_IN_HOUR * SECONDS_IN_MINUTE)/ MINUTE_IN_HOUR*SECONDS_IN_MINUTE );
//    }
//        public static int numberOfMinutes (long seconds){
//                    long result3 = ((seconds %(HOUR_IN_DAY * MINUTE_IN_HOUR * SECONDS_IN_MINUTE)/ % MINUTE_IN_HOUR*SECONDS_IN_MINUTE )));
//        }
//      public static int numberOfSeconds(long seconds){
//                        long result4 = (seconds / (HOUR_IN_DAY * MINUTE_IN_HOUR * SECONDS_IN_MINUTE));
//            }
    }

        //numberOfDays = input / 86400;
        // numberOfHours = (input % 86400 ) / 3600 ;
        //numberOfMinutes = ((input % 86400 ) % 3600 ) / 60
        //numberOfSeconds = ((input % 86400 ) % 3600 ) % 60  ;







