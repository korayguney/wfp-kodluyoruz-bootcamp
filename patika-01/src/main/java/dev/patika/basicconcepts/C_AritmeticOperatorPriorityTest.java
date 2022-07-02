package dev.patika.basicconcepts;

public class C_AritmeticOperatorPriorityTest {
    public static void main(String[] args) {
        // () * / % + -
        int a = 2;
        int b = 10;

        System.out.println(a * b + b / 2); // 25
        System.out.println(a * (b + b) / 2); // 20
        System.out.println(a * b + b % 3); // 21
    }
}
