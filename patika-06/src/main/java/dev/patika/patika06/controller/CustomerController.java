package dev.patika.patika06.controller;

import dev.patika.patika06.models.Customer;
import dev.patika.patika06.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.findAllCustomers();
    }

    @GetMapping("/customers/id")
    public Customer getCustomer(@RequestParam int id) {
        return customerService.getCustomer(id);
    }

    @PostMapping("/customers")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @DeleteMapping("/customers/id")
    public String deleteCustomer(@RequestParam int id) {
        customerService.deleteCustomer(id);
        return "Deleted...";
    }
}
