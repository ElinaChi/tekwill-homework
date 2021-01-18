package com.tekwill.learning.flowcontrol.loop;

public class ConverterBetweenFeetAndMetersDemo {
    public static void main (String []args){
        double foot = 1.0;
        double meters = 20.0;

System.out.println("Feet          Meters         |   Meters                  Feet");
for (foot =1.0, meters = 20; foot <=10.0; foot++, meters+=5 ){
    System.out.printf("%.1f %15.3f          |   %.1f  %25.3f \n", foot, ConverterBetweenFeetAndMeters.footToMeter(foot), meters, ConverterBetweenFeetAndMeters.meterToFoot(meters));

}
    }
}
