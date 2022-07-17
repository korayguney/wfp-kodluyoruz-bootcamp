package dev.patika.patika06.utils;

import dev.patika.patika06.models.*;
import dev.patika.patika06.repository.AccidentRepository;
import dev.patika.patika06.repository.CustomerRepository;
import dev.patika.patika06.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.Month;

@Component
@RequiredArgsConstructor
public class InitializerRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(InitializerRunner.class);

    private final AccidentRepository accidentRepository;
    private final CustomerRepository customerRepository;
    private final VehicleRepository vehicleRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        accidentRepository.deleteAll();
        customerRepository.deleteAll();
        vehicleRepository.deleteAll();

        Customer customer1 = new Customer("Koray Guney", "Ankara", 111111111L);
        Customer customer2 = new Customer("Ali Veli", "Adana", 2222222222L);
        Customer customer3 = new Customer("Ayse Gunes", "Izmir", 333333333L);

        Vehicle car1 = new Car(2020, "Mitsibushi Lancer", "34BH4545", "Black");
        Vehicle car2 = new Car(2015, "Fiat 300L", "25HG453", "Yellow");
        Vehicle moto1 = new Motorcycle(2016, "Suzuki", "65HG43", 120.0);
        Vehicle moto2 = new Motorcycle(2021, "Yamaha", "05G453", 255.5);
        Vehicle moto3 = new Motorcycle(2020, "Harley Davidson", "01TT3321", 420.0);

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

        vehicleRepository.save(car1);
        vehicleRepository.save(car2);
        vehicleRepository.save(moto1);
        vehicleRepository.save(moto2);
        vehicleRepository.save(moto3);

        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);

        accidentRepository.save(accident1);
        accidentRepository.save(accident2);
        accidentRepository.save(accident3);

        logger.info("All test data saved...");

    }
}
