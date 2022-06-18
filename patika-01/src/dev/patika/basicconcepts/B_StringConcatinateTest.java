package dev.patika.basicconcepts;

public class B_StringConcatinateTest {
    public static void main(String[] args) {
        System.out.println("Hello " + 20 + 22);
        System.out.println("Hello " + (Integer.valueOf("20") + Integer.valueOf("22")));
        System.out.println(20 + 22 + "Hello " + 20 + 22);
    }
}
