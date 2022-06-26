package dev.patika.models;

import javax.persistence.Entity;

@Entity
public class Car extends Vehicle {
    private String color;

    public Car(int year, String model, String plate, String color) {
        super(year, model, plate);
        this.color = color;
    }

    public Car(){}

    public Car(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
