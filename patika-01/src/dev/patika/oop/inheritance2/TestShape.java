package dev.patika.oop.inheritance2;

public class TestShape {
    public static void main(String[] args) {

        Circle circle = new Circle(10 , "Blue");
        System.out.println(circle.getColor() + " Circle area is " + circle.getArea());

        Rectange rectange = new Rectange("Yellow", 10, 10);
        System.out.println(rectange.getColor() + " Rectangle area is " + rectange.getArea());





    }
}
