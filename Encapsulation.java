package com.company;

public class Encapsulation {
    private String FirstName;
    private String LastName;
    private int id;

    //use get() method
    public String getFirstName(){
        return FirstName;
    }
    //use set() method
    public void setFirstName(String FirstName){
        this.FirstName=FirstName;
    }
    //use get() method
    public String getLastName(){
        return LastName;
    }
    //use set() method
    public void setLastName(String LastName){
        this.LastName=LastName;
    }
    //use get() method
    public int getId(){
        return id;
    }
    //use set() method
    public void setId(int id){
        this.id=id;
    }
    //main method

    public static void main(String[] args) {
        //create an object
        Encapsulation en=new Encapsulation();//[class name object name=new class name]
        //method calling
        en.setFirstName("JAY");
        en.setLastName("SANAP");
        en.setId(123);
        //print statment
        System.out.println("FirstName"+en.getFirstName());
        System.out.println("LastName"+en.getLastName());
        System.out.println("id"+en.getId());

    }
}
