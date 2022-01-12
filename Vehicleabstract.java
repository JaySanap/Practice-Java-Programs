package com.company;

abstract class Vehicleabstract {
    //take method hidding implementation
    abstract void start();
}
class Car extends Vehicleabstract
{
    void start()
    {
        System.out.println(" car starts with key ");
    }

}
class scooter extends Vehicleabstract
{
    void start()
    {
        System.out.println(" scooter starts with kick ");
    }

//main method
public static void main(String[] args) {
    //we cannot create object in abstract class
    Car c=new Car();//object of child class
    c.start();//calling start method
    scooter s=new scooter();
    s.start();

}
}
