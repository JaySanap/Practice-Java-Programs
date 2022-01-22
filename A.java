package com.company;

public class A {
    int a=10;
}
class B extends A {
    int a = 20;

    void show(int a) {
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        B obj1=new B();
        obj1.show(30);
    }
}
