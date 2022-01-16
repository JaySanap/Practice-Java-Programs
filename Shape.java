package com.company;
import java.util.Scanner;
import java.io.Serializable;
public abstract class Shape {
    abstract double calaculateArea();
}
class Rectangle  extends Shape{
    int base;
    int height;;
    public Rectangle(int base,int height){
        this.base=base;
        this.height=height;
    }

    @Override
    double calaculateArea() {
        return (base*height);
    }
}
class Square extends Shape{
    int side;
    public Square(int side){
        this.side=side;
    }

    @Override
    double calaculateArea() {
        return (side*side);
    }
}

class Circle extends Shape{
    int radius;
    public Circle(int radius){
        this.radius=radius;
    }

    @Override
    double calaculateArea() {
        return (3.14*radius*radius);
    }
}
class ShapeImp1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.Rectangle");
            System.out.println("2.Square");

            System.out.println("3.Circle");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            ch=sc.nextInt();
            Shape shape1;
            switch (ch){
                case 1:
                    System.out.println("Enter base & height:");
                    int base=sc.nextInt();
                    int height=sc.nextInt();
                    shape1 =new Rectangle(base,height);
                    System.out.println("Area of rectangle "+shape1.calaculateArea());
                    break;
                case 2:
                    System.out.println("Enter side");
                    int side=sc.nextInt();
                    shape1=new Square(side);
                    System.out.println("Area of square"+shape1.calaculateArea());
                    break;

                case 3:
                    System.out.println("Enter radius");
                    int radius=sc.nextInt();
                    shape1=new Circle(radius);
                    System.out.println("Area of circle"+shape1.calaculateArea());
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice!!");
                    break;


            }

        }while (ch>5);

    }
}
