package dev.patika.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Exception4 {

    public static void main(String[] args) {
        foo();
    }

    private static void foo() {
        System.out.println("File will be open...");
        try {
            InputStream in = new FileInputStream(new File("C:\\Users\\koray\\wfp-kodluyoruz-bootcamp\\patika-basics\\src\\dev\\patika\\exceptions\\missingfile.txt"));
            System.out.println(1/0);
        } catch (FileNotFoundException | ArithmeticException | NullPointerException e) {
            System.out.println("An exception occured...");
        }


        System.out.println("File has opened...");
    }


}
