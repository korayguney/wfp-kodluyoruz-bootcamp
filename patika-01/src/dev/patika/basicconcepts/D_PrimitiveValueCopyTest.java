package dev.patika.basicconcepts;

public class D_PrimitiveValueCopyTest {
    public static void main(String[] args) {
        // pass-by-value & pass-by-reference
        int m = 12;
        int n = m; // 12

        m++;

        System.out.println(m); // 13
        System.out.println(n); // 12
    }
}
