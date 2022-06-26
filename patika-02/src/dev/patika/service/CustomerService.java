package dev.patika.service;

import dev.patika.models.Customer;
import dev.patika.models.Vehicle;
import dev.patika.repository.CrudRepository;
import dev.patika.repository.CustomerRepository;
import dev.patika.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerService implements CrudRepository<Customer>, CustomerRepository {

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
            // EntityManagerUtils.closeEntityManager(em);
        }
    }

    @Override
    public void deleteFromDatabase(Customer customer) {
        try {
            em.getTransaction().begin();
            em.remove(customer);
            em.getTransaction().commit();
            System.out.println("Deleted...");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            // EntityManagerUtils.closeEntityManager(em);
        }
    }

    @Override
    public void deleteFromDatabase(int id) {
        try {
            em.getTransaction().begin();
            Customer foundCustomer = findById(id);
            em.remove(foundCustomer);
            em.getTransaction().commit();
            System.out.println("Deleted...");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            // EntityManagerUtils.closeEntityManager(em);
        }
    }

    @Override
    public void updateOnDatabase(Customer customer, int id) {
        try {
            em.getTransaction().begin();

            em.merge(customer);

            em.getTransaction().commit();
            System.out.println("Deleted...");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            // EntityManagerUtils.closeEntityManager(em);
        }
    }

    @Override
    public void deleteCustomerWithId(int id) {
        try {
            em.getTransaction().begin();

            Customer foundCustomer = em.createQuery("FROM Customer c WHERE c.id =:custId", Customer.class)
                    .setParameter("custId", id)
                    .getSingleResult();
            em.remove(foundCustomer);

            em.getTransaction().commit();
            System.out.println("Deleted...");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            // EntityManagerUtils.closeEntityManager(em);
        }
    }

    @Override
    public List<Vehicle> getCustomerVehicleList(Customer customer) {
        Customer foundCustomer = em.find(Customer.class, customer.getId());
        return foundCustomer.getVehicleList();
    }
}
