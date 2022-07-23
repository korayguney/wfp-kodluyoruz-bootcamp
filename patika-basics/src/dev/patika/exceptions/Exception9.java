package dev.patika.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Exception9 {
    public static void main(String[] args) {
        System.out.println("Entered main");
        methodA();
        System.out.println("Exit from main");
    }

    private static void methodA() {
        System.out.println("Entered methodA");
        methodB();
        System.out.println("Exit from methodA");
    }

    private static void methodB() {
        System.out.println("Entered methodB");
        methodC();
        System.out.println("Exit from methodB");
    }

    private static void methodC() {
        System.out.println("Entered methodC");
        try {
            InputStream in = new FileInputStream(new File("missingfile.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found ...");
        }
        System.out.println("Exit from methodC");
    }
}
