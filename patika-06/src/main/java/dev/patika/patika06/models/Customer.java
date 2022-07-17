package dev.patika.patika06.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// POJO --> Plain Old Java Object
@Entity
@Data
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private long ssid;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Vehicle> vehicleList = new ArrayList<>();

    public Customer(String name, String address, long ssid) {
        this.name = name;
        this.address = address;
        this.ssid = ssid;
    }
}
