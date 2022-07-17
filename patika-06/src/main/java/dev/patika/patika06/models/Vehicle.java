package dev.patika.patika06.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int year;
    private String model;
    private String plate;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @JsonIgnore
    @ManyToMany
    private List<Accident> accidents = new ArrayList<>();

    public Vehicle(int year, String model, String plate) {
        this.year = year;
        this.model = model;
        this.plate = plate;
    }
}
