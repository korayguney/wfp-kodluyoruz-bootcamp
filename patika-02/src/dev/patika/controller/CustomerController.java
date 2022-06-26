package dev.patika.controller;

import dev.patika.models.Customer;
import dev.patika.models.Vehicle;
import dev.patika.service.CustomerService;

import java.util.List;

public class CustomerController {

    private CustomerService customerService = new CustomerService();

    public List<Customer> findAllCustomers(){
        return customerService.findAll();
    }

    public Customer findCustomerById(int id) {
        return customerService.findById(id);
    }

    public void saveCustomer(Customer customer) {
        customerService.saveToDatabase(customer);
    }

    public void deleteCustomer(Customer customer) {
        customerService.deleteFromDatabase(customer);
    }

    public void deleteCustomer(int id) {
        customerService.deleteFromDatabase(id);
    }

    public void deleteCustomerWithPrimaryId(int id) {
        customerService.deleteCustomerWithId(id);
    }

    public void updateCustomer(Customer customer, int id) {
        customerService.updateOnDatabase(customer, id);
    }

    public List<Vehicle> getcustomerVehicleList(Customer customer) {
        return customerService.getCustomerVehicleList(customer);
    }
}
