package dev.patika.oop.poly;

public class TestShape {
    public static void main(String[] args) {
        Pen pen = new Pen();

        Circle circle = new Circle(10, "Blue");
        Rectange rectange = new Rectange("Yellow", 10, 10);

        if (circle instanceof Circle) {
            pen.draw(circle);
            pen.changeColor("Yellow", circle);
        }

        if(rectange instanceof Rectange) {
            pen.draw(rectange);
            pen.changeColor("White", rectange);
        }


    }
}
