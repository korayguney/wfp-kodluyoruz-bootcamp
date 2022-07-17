package dev.patika.patika06.service;

import dev.patika.patika06.dto.VehicleDTO;
import dev.patika.patika06.models.Customer;
import dev.patika.patika06.models.Vehicle;
import dev.patika.patika06.repository.CustomerRepository;
import dev.patika.patika06.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;
    @Autowired
    CustomerRepository customerRepository;

    public Vehicle saveVehicle(VehicleDTO vehicleDTO) {
        Customer foundCustomer = customerRepository.findCustomer(vehicleDTO.getCustomerId());

        // manuel mapping (DTO to entity)
        Vehicle vehicle = new Vehicle();
        vehicle.setModel(vehicleDTO.getModel());
        vehicle.setPlate(vehicleDTO.getPlate());
        vehicle.setYear(vehicleDTO.getYear());
        vehicle.setCustomer(foundCustomer);

        return vehicleRepository.save(vehicle);
    }
}
