package com.tekwill.learning.flowcontrol.loop;

public class NumbersDivisible {
    public static void main (String []args){
        int x;
        for (x = 100; x <= 1000; x++){
           if (x % 5 == 0 && x % 6 == 0)
               System.out.printf("%4d", x);

        }
    }
}

