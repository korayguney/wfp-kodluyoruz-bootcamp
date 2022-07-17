package dev.patika.patika06.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDTO {
    private int year;
    private String model;
    private String plate;
    private int customerId;
}
