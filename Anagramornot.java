package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Anagramornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two String");


        String str1=sc.nextLine();
        String str2=sc.nextLine();

        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sortedstr1=new String(arr1);
        String sortedstr2=new String(arr2);

        if(sortedstr1.equals(sortedstr2))
        {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not an Anagram");
        }


    }
}
