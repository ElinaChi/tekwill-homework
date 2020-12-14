package com.tekwill.learning.datatypes;

public class Statistics {
    static long CurrentWorldPopulation = 7_831_436_005L;
    static float GrowthRate = 1.05f;
    static String source1 = "World Population Prospect the 2019 Revision - United Nations, Departament of Economic and Social Affairs, Population Division (2019, June)";
    static String source2 = "International Programs Center at the U.S. Census Bureau. Population Division";



    public static void main (String args []){
        System.out.println(Statistics.CurrentWorldPopulation + "\b Current World Population");
        System.out.println("is currently (2020) growing at a rate of "+ Statistics.GrowthRate + " % per years");

        System.out.println(source1);
        System.out.println(source2);

    }


}
