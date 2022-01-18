package com.company;

public class ThisKeyword {
    //instance variable decleare
    int i;
    void setvalue(int i)
    {
        this.i=i;
    }
    void show()
    {
        System.out.println(i);
    }

    public static void main(String[] args) {
        ThisKeyword thisKeyword=new ThisKeyword();
        thisKeyword.setvalue(10);
        thisKeyword.show();
    }
}
