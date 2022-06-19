package dev.patika.oop.inheritance3;

public class TestShape {
    public static void main(String[] args) {
        Pen pen = new Pen();

        Shape circle = new Circle(10, "Blue");
        Shape rectange = new Rectange("Yellow", 10, 10);

        if (circle instanceof Circle) {
            pen.draw((Circle) circle);
            pen.changeColor("Yellow", (Circle) circle);
        }

        if(rectange instanceof Rectange) {
            pen.draw((Rectange) rectange);
            pen.changeColor("White", (Rectange) rectange);
        }


    }
}
