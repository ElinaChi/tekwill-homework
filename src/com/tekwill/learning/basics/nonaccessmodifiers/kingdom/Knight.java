package com.tekwill.learning.basics.nonaccessmodifiers.kingdom;

public class Knight {
    static String guild = "Hunters";
   private int age;
    private String nickname;

    public Knight(int age, String nickname){
        this.age = age;
        this.nickname = nickname;
    }

    public String toString() {
        return
                "age = " + age +
                ", nickname = " + nickname ;
    }
    public void Fight(){
    System.out.println("Fight!");
    }

    public static void Magic(){
        System.out.println("Maaaaagic!");
    }
}
