package dev.patika.patika05.service;

import com.fasterxml.jackson.databind.util.ArrayIterator;
import dev.patika.patika05.model.Employee;
import dev.patika.patika05.repository.EmployeeRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceImplTest {

    @Mock
    EmployeeRepository repository;

    @InjectMocks
    EmployeeServiceImpl employeeService;


    @Test
    void findAllTest() {
        // given
        Employee employee1 = new Employee();
        employee1.setSalary(25000);
        Employee employee2 = new Employee();
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        Mockito.when(repository.findAll()).thenReturn(employees);

        // when
        List<Employee> expected = employeeService.findAll();

        // then
        Assertions.assertNotNull(expected);
        Assertions.assertEquals(employees.size(), 2);
        Assertions.assertTrue(expected.get(0).getSalary() > 20000);
    }

}