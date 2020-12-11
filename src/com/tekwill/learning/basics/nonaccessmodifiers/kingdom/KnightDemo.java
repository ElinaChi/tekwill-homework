package com.tekwill.learning.basics.nonaccessmodifiers.kingdom;

public class KnightDemo {
    public static void main (String[]args){
    Knight kn1 = new Knight(22, "Tom");
    Knight kn2 = new Knight(33, "Mike");
    Knight kn3 = new Knight(44, "Brian");

    System.out.println(kn1);
    System.out.println(kn1.guild);
    System.out.println(kn2);
    System.out.println(Knight.guild);
    Knight.guild = "Best";
    System.out.println(kn2.guild);
    kn1.Fight();
    kn2.Magic();

}

}
