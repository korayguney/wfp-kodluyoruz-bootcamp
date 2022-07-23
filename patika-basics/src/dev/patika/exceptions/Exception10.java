package dev.patika.exceptions;

public class Exception10 {
    public static void main(String[] args) {
        foo();
    }

    private static void foo() {
        try {
            String a = null;
            System.out.println(a.toLowerCase());
        } catch (NullPointerException e) {
           throw new NullPointerException("Null pointer exception occured...");
        } finally {
            throw new RuntimeException("Run time exception occured...");
        }

    }
}
