package com.tekwill.learning.javaapi.arrays;

public class HomeArrayExercises {
    public static void main (String []args){
        //a) display the value of element 6 of array f
        int [] f = new int[12];
        System.out.println(f[6]);

        //b) initialized each of the five elements of one dimensional int array g to 8
        int [] g = {10,20,30,40,50,60,70,80};
        for (int index= 0; index <g.length;index++)
        System.out.print(g[index]+ " ");

        //c) total the 100 elements of floating point array c
        float [] c = new float [100];
        int total= 0;
        for (int index2=0; index2<c.length; index2++)
        total+=c[index2];
        System.out.println();
        System.out.printf("Total of array elements:%d%n", total);

        //d)copy 11-element array a into the first portion of array b, which contains 34 elements
        int [] a = new int[12];
        int [] b = new int[34];
      // for (int index3=0;index3<);

        //e)determine and display the smallest and largest values contained in 99-element floating point array w
       float [] w= new float[99];

    }
}
