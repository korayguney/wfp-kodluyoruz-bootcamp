package dev.patika.patika05.service;

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

      //  // given
      //  Mockito.when(repository.findAll()).thenReturn(Mockito.anyIterable());
//
      //  // when
      //  List<Employee> expected = employeeService.findAll();
//
      //  // then
      //  Assertions.assertNotNull(expected);
    }

}