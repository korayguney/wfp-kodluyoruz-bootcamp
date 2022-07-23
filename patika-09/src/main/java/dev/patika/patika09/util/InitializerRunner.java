package dev.patika.patika09.util;

import dev.patika.patika09.entity.User;
import dev.patika.patika09.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitializerRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(InitializerRunner.class);

    @Autowired
    UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();

        repository.save(User.builder().name("Ali").age(23).email("a@a.com").build());
        repository.save(User.builder().age(35).name("Hasan").email("ha@ah.com").build());
        repository.save(User.builder().age(56).name("Ahmet").email("ahmet@ah.com").build());
        repository.save(User.builder().age(22).name("Ayşe").email("ayse@a.com").build());

        repository.findAll().forEach(user -> logger.info("{}", user));

    }
}
