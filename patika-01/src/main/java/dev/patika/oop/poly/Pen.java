package dev.patika.oop.poly;

public class Pen {

    public void draw (Shape s){
        if(s instanceof Circle){
            System.out.println(s.getColor() + " Circle area is " + s.getArea());
        } else if(s instanceof Rectange) {
            System.out.println(s.getColor() + " Rectangle area is " + s.getArea());
        }
    }

    public void changeColor(String color, Shape s) {
        s.setColor(color);
        draw(s);
    }

}
