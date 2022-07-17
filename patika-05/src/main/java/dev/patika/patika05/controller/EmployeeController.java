package dev.patika.patika05.controller;

import dev.patika.patika05.model.Employee;
import dev.patika.patika05.service.EmployeeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeServiceImpl employeeService;

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity<>(employeeService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.findById(id);
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>((Employee) employeeService.save(employee), HttpStatus.OK);
    }

    @PutMapping("/employees")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>((Employee) employeeService.update(employee), HttpStatus.OK);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployeeById(@PathVariable Long id) {
        employeeService.deleteById(id);
        return "Deleted...";
    }

    @DeleteMapping("/employees/delete/{fullname}")
    public String deleteEmployeeById(@PathVariable String fullname) {
        employeeService.deleteByFullname(fullname);
        return "Deleted...";
    }

    @GetMapping("/employees/count")
    public int getAllEmployeeCount() {
        return employeeService.getAllEmployeeCount();
    }

    @GetMapping("/employees/salarygroup")
    public List<?> getSalariesWithGrouping() {
        return employeeService.getSalariesWithGrouping();
    }

    @GetMapping("/employees/findByFullname")
    public List<Employee> findByFullname(String fullname) {
        return employeeService.findByFullname(fullname);
    }

    @GetMapping("/employees/findByFullnameContaining")
    public List<Employee> findByFullnameContaining(String str) {
        return employeeService.findByFullnameContaining(str);
    }

    @GetMapping("/employees/findBySalaryIsGreaterThan")
    public List<Employee> findBySalaryIsGreaterThan(double salary) {
        return employeeService.findBySalaryIsGreaterThan(salary);
    }

    @GetMapping("/employees/findTopBySalaryIsGreaterThan")
    public List<Employee> findTopBySalaryIsGreaterThan(double salary) {
        return employeeService.findTopBySalaryIsGreaterThan(salary);
    }


}
