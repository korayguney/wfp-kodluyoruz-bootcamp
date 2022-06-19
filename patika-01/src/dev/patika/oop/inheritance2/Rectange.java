package dev.patika.oop.inheritance2;

public class Rectange extends Shape{
    private double width;
    private double height;

    public Rectange(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectange(String color, double width) {
        super(color);
        this.width = width;
    }

    public Rectange(double width) {
        this.width = width;
    }

    public Rectange(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
