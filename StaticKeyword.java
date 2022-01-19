package com.company;

public class StaticKeyword {
    int empid;
    String name;
    static String company=" JS ";

    StaticKeyword(int empid,String name )
    {
        this.empid=empid;
        this.name=name;
    }



    void display()
    {
        System.out.println(empid+" "+name+" "+company+" ");
    }

    public static void main(String[] args) {
        StaticKeyword emp1=new StaticKeyword(101,"jay");
                emp1.display();
        StaticKeyword emp2=new StaticKeyword(102,"nikhil");
                emp2.display();

    }
}
