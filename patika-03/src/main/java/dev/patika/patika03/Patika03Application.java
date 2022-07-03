package dev.patika.patika03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
public class Patika03Application {

    public static void main(String[] args) {
        SpringApplication.run(Patika03Application.class, args);
        // Circle circle = new Circle();
        // circle.setRadius(10);
        // System.out.println("Area of circle : " + circle.getArea());
    }

    @Bean
    public Student foo(){
        Student student = new Student();
        student.setAge(18);
        return student;
    }
}
