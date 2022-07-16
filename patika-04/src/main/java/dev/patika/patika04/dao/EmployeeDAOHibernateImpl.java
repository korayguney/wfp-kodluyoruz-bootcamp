package dev.patika.patika04.dao;

import dev.patika.patika04.model.Employee;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO<Employee> {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeDAOHibernateImpl.class);
    EntityManager entityManager;

    public EmployeeDAOHibernateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        logger.debug("EmployeeDAOHibernateImpl is used...");
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from Employee", Employee.class).getResultList();
    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public Employee save(Employee object) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Employee update(Employee object) {
        return null;
    }
}
