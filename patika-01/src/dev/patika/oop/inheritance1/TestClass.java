package dev.patika.oop.inheritance1;

import java.text.DecimalFormat;

public class TestClass {
    public static void main(String[] args) {
        Circle circle = new Circle(10, "Black");
        System.out.println(circle.getColor() + " circle area is " + new DecimalFormat("##.##").format(circle.getArea()));


        Cylinder cylinder = new Cylinder(10, "yellow", 10);
        System.out.println(cylinder.getColor() + " cylinder area is " + new DecimalFormat("##.##").format(cylinder.getArea()));

    }
}
