package com.company;

public class car {
    String name;
    String colour;
    static int wheels=4;

    car(String name,String colour)
    {
        this.name=name;
        this.colour=colour;
    }
    void display()
    {
        System.out.println(name+" "+colour+" "+wheels+" ");
    }

    public static void main(String[] args) {
        car c1=new car("Ertiga"," Red");
        c1.display();
        car c2=new car("Brezza","White");
        c2.display();


    }
}
