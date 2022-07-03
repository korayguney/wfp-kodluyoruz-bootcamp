package dev.patika.patika04.service;

import dev.patika.patika04.dao.EmployeeDAO;
import dev.patika.patika04.dao.EmployeeDAOJPAImpl;
import dev.patika.patika04.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService<Employee> {

    EmployeeDAO employeeDAO;

    //@Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public Employee save(Employee employee) {
        return (Employee) employeeDAO.save(employee);
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }
}
