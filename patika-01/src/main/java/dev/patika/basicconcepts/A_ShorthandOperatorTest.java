package dev.patika.basicconcepts;

public class A_ShorthandOperatorTest {
    public static void main(String[] args) {
        int x = 2;
        int y = ++x; // x + 1; short hand operator
        int z = --x; // x - 1; short hand operator

        System.out.println(" x : " + x); // 2
        System.out.println(" y : " + y); // 3
        System.out.println(" z : " + z); // 2
        System.out.println(" x : " + x); // 2
    }
}
