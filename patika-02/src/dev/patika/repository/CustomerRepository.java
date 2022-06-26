package dev.patika.repository;

import dev.patika.models.Customer;
import dev.patika.models.Vehicle;

import java.util.List;

public interface CustomerRepository {

    void deleteCustomerWithId(int id);

    List<Vehicle> getCustomerVehicleList(Customer customer);

}
