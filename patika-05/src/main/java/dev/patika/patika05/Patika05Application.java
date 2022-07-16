package dev.patika.patika05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Patika05Application {

    public static void main(String[] args) {
        SpringApplication.run(Patika05Application.class, args);
    }

}
