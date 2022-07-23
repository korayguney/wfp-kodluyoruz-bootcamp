package dev.patika.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Exception2 {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Test 1");
        System.out.println("Test 2");
        System.out.println("Test 3");
        foo();
        System.out.println("Test 4");
        System.out.println("Test 5");

    }

    private static void foo() throws FileNotFoundException {
        System.out.println("File will be open...");
        InputStream in = new FileInputStream(new File("missingfile.txt"));
        System.out.println("File has opened...");
    }


}
