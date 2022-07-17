package dev.patika.patika05.repository;

import dev.patika.patika05.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Query("select count(e) from Employee e")
    public int getNumberOfEmployeeNumber();

    @Query("select e.salary, count(e.salary) from Employee e GROUP BY e.salary")
    List<?> getSalariesWithGrouping();

    // method driven query
    List<Employee> findByFullname(String fullname);
    List<Employee> findByFullnameContaining(String str);
    List<Employee> findBySalaryIsGreaterThan(double salary);
    List<Employee> findTopBySalaryIsGreaterThan(double salary);



}
