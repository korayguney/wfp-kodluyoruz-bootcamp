package dev.patika.patika06.service;

import dev.patika.patika06.exceptions.CustomerAlreadyExistsException;
import dev.patika.patika06.models.Customer;
import dev.patika.patika06.repository.CustomerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {
    @Mock
    CustomerRepository repository;

    @InjectMocks
    CustomerService service;

    @Test
    void saveCustomerErrorTest() {
        // given
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("aa");
        customer.setAddress("bb");
        customer.setSsid(1l);
        Mockito.when(repository.findCustomerBySsid(Mockito.anyLong()))
                .thenReturn(customer);

        // when
       Executable executable = () -> service.saveCustomer(customer);

        // then
        Assertions.assertThrows(CustomerAlreadyExistsException.class, executable);
    }

    @Test
    void saveCustomerTest() {
        // given
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("aa");
        customer.setAddress("bb");
        customer.setSsid(1l);
        Mockito.when(repository.save(Mockito.any()))
                .thenReturn(customer);

        // when
        Customer expected = service.saveCustomer(customer);

        // then
        Assertions.assertEquals(expected, customer);

    }
}