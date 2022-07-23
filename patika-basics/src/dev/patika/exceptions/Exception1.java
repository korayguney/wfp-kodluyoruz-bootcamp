package dev.patika.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Exception1 {

    public static void main(String[] args) {
        System.out.println("Test 1");
        System.out.println("Test 2");
        System.out.println("Test 3");
        foo();
        System.out.println("Test 4");
        System.out.println("Test 5");


    }

    private static void foo() {
        System.out.println("File will be open...");
        try {
            InputStream in = new FileInputStream(new File("missingfile.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
       // System.out.println("File has opened...");
    }


}
