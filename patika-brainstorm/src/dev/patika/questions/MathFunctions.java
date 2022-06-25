package dev.patika.questions;

// Java is pass-by-value! not pass-by-reference!!!
public class MathFunctions {
    public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        MathFunctions.addToInt(a, b);
        System.out.println(a);
    }
}

// 10
// 15
// 25
// Compiler error on line 3.
// Compiler error on line 8.
// None of the above.