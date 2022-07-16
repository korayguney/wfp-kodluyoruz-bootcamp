package dev.patika.patika05.service;

import dev.patika.patika05.model.Employee;
import dev.patika.patika05.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl {

    final EmployeeRepository employeeRepository;

    @Transactional(readOnly = true)
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        Iterable<Employee> employeeIterable = employeeRepository.findAll();
        employeeIterable.iterator().forEachRemaining(employees::add); // stream api
        return employees;
    }

    @Transactional
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Transactional(readOnly = true)
    public Employee findById(long id) {
        return employeeRepository.findById(id).get();
    }

    @Transactional
    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Transactional
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
