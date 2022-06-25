package dev.patika.clients;

import dev.patika.models.*;
import dev.patika.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.time.Month;

public class TestInsuranceClient {
    public static void main(String[] args) {

        saveTestData();
    }

    private static void saveTestData() {

        Customer customer1 = new Customer("Koray Guney", "Istanbul", 111111111L);
        Customer customer2 = new Customer("Ali Veli", "Adana", 2222222222L);
        Customer customer3 = new Customer("Ayse Gunes", "Izmir", 333333333L);

        Vehicle car1 = new Car(2020, "Mitsibushi Lancer", "34BH4545","Black");
        Vehicle car2 = new Car(2015, "Fiat 300L", "25HG453","Yellow");
        Vehicle moto1 = new Motorcycle(2016, "Suzuki", "65HG43",120.0);
        Vehicle moto2 = new Motorcycle(2021, "Yamaha", "05G453",255.5);
        Vehicle moto3 = new Motorcycle(2020, "Harley Davidson", "01TT3321",420.0);

        car1.setCustomer(customer1);
        car2.setCustomer(customer2);
        moto1.setCustomer(customer3);
        moto2.setCustomer(customer3);
        moto3.setCustomer(customer1);

        Accident accident1 = new Accident(LocalDate.of(2021, Month.APRIL, 12));
        Accident accident2 = new Accident(LocalDate.of(2018, Month.MARCH, 05));
        Accident accident3 = new Accident(LocalDate.of(2020, Month.JUNE, 20));

        car1.getAccidents().add(accident1);
        car2.getAccidents().add(accident1);
        moto1.getAccidents().add(accident2);
        moto1.getAccidents().add(accident3);
        moto3.getAccidents().add(accident2);

        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");

        try {
            em.getTransaction().begin();

            em.persist(car1);
            em.persist(car2);
            em.persist(moto1);
            em.persist(moto2);
            em.persist(moto3);

            em.persist(customer1);
            em.persist(customer2);
            em.persist(customer3);

            em.persist(accident1);
            em.persist(accident2);
            em.persist(accident3);

            em.getTransaction().commit();

            System.out.println("All data persisted...");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }

    }
}
