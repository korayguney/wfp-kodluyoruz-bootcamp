package dev.patika.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Exception7 {
    public static void main(String[] args) {
        System.out.println("Entered main");
        try {
            methodA();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Exit from main");
    }

    private static void methodA() throws FileNotFoundException {
        System.out.println("Entered methodA");
        methodB();
        System.out.println("Exit from methodA");
    }

    private static void methodB() throws FileNotFoundException {
        System.out.println("Entered methodB");
        methodC();
        System.out.println("Exit from methodB");
    }

    private static void methodC() throws FileNotFoundException {
        System.out.println("Entered methodC");
        InputStream in = new FileInputStream(new File("missingfile.txt"));
        System.out.println("Exit from methodC");
    }
}
