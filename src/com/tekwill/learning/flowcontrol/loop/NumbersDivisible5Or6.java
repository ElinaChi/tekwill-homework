package com.tekwill.learning.flowcontrol.loop;

public class NumbersDivisible5Or6 {
    public static void main(String[] args) {
        int x;
        int lineNumber = 0;

        for (x = 100; x <= 200; x++)
            if (x % 5 == 0 || x % 6 == 0) {
                System.out.print(x + " ");
                lineNumber++;
                if (lineNumber % 10 == 0) System.out.println();


            }

    }
}


