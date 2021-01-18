package com.tekwill.learning.flowcontrol.loop;

public class NumbersDivisible5And6 {
    public static void main (String []args){
        int x; int j = 0;
        for (x = 100; x <= 1000; x++)
           if (x % 5 == 0 && x % 6 == 0){
               System.out.print(x + " ");
               j++;
               if (j % 10 == 0) System.out.println();

        }
    }
}

