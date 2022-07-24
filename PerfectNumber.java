package com.company;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        // logic n=6  1,2,3,4,5
        //  n=6    sum=1+2+3

        int n;
        int sum = 0;


        System.out.println(" Enter any number ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();


        for (int i=1;i<n;i++)
        {
           if (n%i==0){
               sum=sum+i;
           }

        }
        if (n==sum){
            System.out.println("Perfectnumber");
        }
        else {
            System.out.println("not perfect");
        }

    }
}
