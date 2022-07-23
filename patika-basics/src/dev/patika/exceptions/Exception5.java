package dev.patika.exceptions;

import java.io.*;

public class Exception5 {

    public static void main(String[] args) {
        foo();
    }

    private static void foo() {

        InputStream in = null;

        try {
            System.out.println("File will be open...");
            in = new FileInputStream(new File("missingfile.txt"));
            System.out.println(1 / 0);
            System.out.println("File has opened...");
        } catch (FileNotFoundException e) {
            System.out.println("File not found...");
        } catch (ArithmeticException e){
            System.out.println("An aritmetic exception occured...");
        } catch (IOException e) {
            System.out.println("IO Stream closed...");
        } finally {
            if(in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    // ignore this line
                }
            }
        }
    }


}
