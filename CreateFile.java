package com.company;
import com.sun.source.tree.TryTree;

import java.io.*;

public class CreateFile {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\users\\Desktop\\JS.txt");

            if (f.createNewFile()) {
                System.out.println("File created successfully");
            }
            else {
                System.out.println("File already exist");
            }

        }
        c
        {
            System.out.println("Exception handled");
        }


    }
}
