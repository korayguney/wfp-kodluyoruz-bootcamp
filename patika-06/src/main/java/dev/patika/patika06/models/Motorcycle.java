package dev.patika.patika06.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
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

}
