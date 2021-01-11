package com.tekwill.learning.flowcontrol.loop;

public class OddNumbersProduct {
    public static void main (String []args){
        int product = 1;
        int x;
        for (x = 1; x<=15; x+=2){
            System.out.println(product = product * x);

        }
    }
}
