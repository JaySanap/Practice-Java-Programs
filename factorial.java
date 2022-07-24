package com.company;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        int n;
        int fact=1;


        System.out.println(" Enter any number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println( "Factorail "+ fact);
    }
}
