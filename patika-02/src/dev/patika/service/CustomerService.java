package dev.patika.service;

import dev.patika.models.Customer;
import dev.patika.repository.CrudRepository;
import dev.patika.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerService implements CrudRepository<Customer> {

    EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = em.createQuery("FROM Customer", Customer.class).getResultList();
        return customerList;
    }

    @Override
    public Customer findById(int id) {
        return em.find(Customer.class, id);
    }

    @Override
    public void saveToDatabase(Customer customer) {
        try {
            em.getTransaction().begin();
            em.persist(customer);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
          //  EntityManagerUtils.closeEntityManager(em);
        }
    }

    @Override
    public void deleteFromDatabase(Customer object) {

    }

    @Override
    public void deleteFromDatabase(int id) {

    }

    @Override
    public void updateOnDatabase(Customer object, int id) {

    }
}
