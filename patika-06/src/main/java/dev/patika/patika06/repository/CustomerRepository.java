package dev.patika.patika06.repository;

import dev.patika.patika06.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query("from Customer c WHERE c.id=?1")
    Customer findCustomer(int id);

    // select * from customer where ssid=33333333;
    // method (name) driven query
    Customer findCustomerBySsid(long ssid);
}
