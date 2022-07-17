package dev.patika.patika04.controller;

import dev.patika.patika04.model.Employee;
import dev.patika.patika04.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    EmployeeService employeeService;

    // DI types
    // 1- field injection
    // 2- setter injection
    // 3- constructor injection

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity<>(employeeService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>((Employee) employeeService.save(employee), HttpStatus.OK);
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return (Employee) employeeService.findById(id);
    }

    @PutMapping("/employees")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>((Employee) employeeService.update(employee), HttpStatus.OK);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployeeById(@PathVariable int id) {
        employeeService.deleteById(id);
        return "Deleted...";
    }

}
