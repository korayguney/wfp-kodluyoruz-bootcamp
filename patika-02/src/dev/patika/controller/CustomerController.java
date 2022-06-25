package dev.patika.controller;

import dev.patika.models.Customer;
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

}
