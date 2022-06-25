package dev.patika.service;

import dev.patika.models.Vehicle;
import dev.patika.repository.CrudRepository;

import java.util.List;

public class VehicleService implements CrudRepository<Vehicle> {
    @Override
    public List<Vehicle> findAll() {
        return null;
    }

    @Override
    public Vehicle findById(int id) {
        return null;
    }

    @Override
    public void saveToDatabase(Vehicle object) {

    }

    @Override
    public void deleteFromDatabase(Vehicle object) {

    }

    @Override
    public void deleteFromDatabase(int id) {

    }

    @Override
    public void updateOnDatabase(Vehicle object, int id) {

    }
}
