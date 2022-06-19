package dev.patika.oop.inheritance3;

public class TestShape {
    public static void main(String[] args) {
        Pen pen = new Pen();

        Circle circle = new Circle(10, "Blue");
        Rectange rectange = new Rectange("Yellow", 10, 10);

        pen.draw(circle);
        pen.changeColor("Yellow", circle);

        pen.draw(rectange);
        pen.changeColor("White", rectange);

    }
}
