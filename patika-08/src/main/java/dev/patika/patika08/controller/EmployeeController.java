package dev.patika.patika08.controller;

import dev.patika.patika08.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    List<Employee> employeeList = new ArrayList<>();

    @PostConstruct
    public void init() {
        Employee employee1 = Employee.builder().id(1).salary(25000).fullname("Koray Guney").age(38).build();
        Employee employee2 = Employee.builder().id(1).salary(21000).fullname("Ali Veli").age(34).build();
        Employee employee3 = Employee.builder().id(1).salary(29000).fullname("Ayse Fatma").age(28).build();

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

    }

    @GetMapping("/employees")
    public String getAllEmployees(Model theModel) {
        theModel.addAttribute("employees", employeeList);
        return "employees";
    }


}
