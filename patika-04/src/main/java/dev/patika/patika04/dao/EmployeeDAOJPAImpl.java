package dev.patika.patika04.dao;

import dev.patika.patika04.exception.EmployeeAlreadyExistException;
import dev.patika.patika04.model.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO<Employee>{

    EntityManager entityManager;

    // @Autowired
    public EmployeeDAOJPAImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Employee> findAll() {
        System.out.println("EmployeeDAOJPAImpl is used...");
        return entityManager.createQuery("from Employee", Employee.class).getResultList();
    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        List<Employee> employeeList = entityManager.createQuery("from Employee e WHERE e.phoneNumber =:phone", Employee.class)
                .setParameter("phone", employee.getPhoneNumber()).getResultList();
        if(employeeList.size() > 0) {
           throw new EmployeeAlreadyExistException("Employee is already exists with phone no : " + employee.getPhoneNumber());
        }
        return entityManager.merge(employee);
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Employee update(Employee object) {
        return null;
    }
}
