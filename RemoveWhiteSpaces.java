package com.company;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str=" Java    is   a    programming    langauaagge    ";
        System.out.println("Before removing spaces:"+str);
        str=str.replaceAll("\\s","");
        System.out.println("After removimg white spaces:"+str);
    }
}
