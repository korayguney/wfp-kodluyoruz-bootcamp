package dev.patika.patika04.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDAO<Employee> extends BaseDAO<Employee> {
}
