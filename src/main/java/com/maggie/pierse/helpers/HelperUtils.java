package com.maggie.pierse.helpers;

public class HelperUtils{

    public static void isB(String letter){
        if (letter.equals("b")){
            System.out.println("There's a B here!");
        }
    }

    public static void isAVowel(String letter){
        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")){
            System.out.println("Found a Vowel!!!!");
        }
    }

}