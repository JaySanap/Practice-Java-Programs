package com.company;
import java.io.*;

public class BookBusTickets {

    int Total_Seats=40;   //declare seats in bus

    synchronized void bookSeat(int seats)  //method to book seats
    {
        if (Total_Seats>=seats)
        {
            System.out.println("seats booked successfully");
            Total_Seats=Total_Seats-seats;
            System.out.println("seats left"+Total_Seats);
        }
        else
        {
            System.out.println("seats cannot be booked");
            System.out.println("seats left"+Total_Seats);
        }

    }

}

class BusBookApp extends Thread
{
    static BookBusTickets b; //reference created
    int seats;//variable declare

    @Override
    public void run() {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {

        b=new BookBusTickets();

        BusBookApp Jay=new BusBookApp();
        Jay.seats=10;
        Jay.start();

        BusBookApp Aditya=new BusBookApp();
        Aditya.seats=20;
        Aditya.start();
    }
}
