package dev.patika.exceptions;

import java.io.*;

public class Exception3 {

    public static void main(String[] args) throws FileNotFoundException {

        foo();


    }

    /**
     * @throws FileNotFoundException if ...
     */
    private static void foo() throws FileNotFoundException {
        System.out.println("File will be open...");
        try {
            InputStream in = new FileInputStream(new File("C:\\Users\\koray\\wfp-kodluyoruz-bootcamp\\patika-basics\\src\\dev\\patika\\exceptions\\missingfile.txt"));
            System.out.println(1 / 0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Throwable e) {
           // do not catch throwable...
        }


        System.out.println("File has opened...");
    }


}
