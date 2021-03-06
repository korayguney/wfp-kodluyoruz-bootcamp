package dev.patika.patika04.service;

import dev.patika.patika04.dao.EmployeeDAO;
import dev.patika.patika04.dao.EmployeeDAOJPAImpl;
import dev.patika.patika04.exception.EmployeeAlreadyExistException;
import dev.patika.patika04.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService<Employee> {

    EmployeeDAO employeeDAO;

    //@Autowired
    public EmployeeServiceImpl(@Qualifier("employeeDAOJPAImpl") EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int id) {
        return (Employee) employeeDAO.findById(id);
    }

    @Override
    public Employee save(Employee employee) {
        return (Employee) employeeDAO.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeDAO.deleteById(id);
    }

    @Override
    public Employee update(Employee employee) {
        return (Employee) employeeDAO.update(employee);
    }
}
