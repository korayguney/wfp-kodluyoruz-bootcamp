package dev.patika.basicconcepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayTets {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        List<Integer> integerList = new ArrayList<>();
        
        integerList.add(Integer.valueOf(a)); // autoboxing
        integerList.add(b);
        Integer test = 100;
        int c = test.intValue(); // unboxing
    }
}
