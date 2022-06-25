package dev.patika.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "moto")
public class Motorcycle extends Vehicle {
    @Column(name = "engpower")
    private double enginePower;

    public Motorcycle(int year, String model, String plate, double enginePower) {
        super(year, model, plate);
        this.enginePower = enginePower;
    }

    public Motorcycle(double enginePower) {
        this.enginePower = enginePower;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }
}
