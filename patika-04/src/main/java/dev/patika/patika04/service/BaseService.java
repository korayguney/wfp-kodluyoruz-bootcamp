package dev.patika.patika04.service;

import dev.patika.patika04.exception.EmployeeAlreadyExistException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BaseService<T> {
    List<T> findAll();
    T findById(int id);
    T save(T object) throws EmployeeAlreadyExistException;
    void deleteById(int id);
    T update(T object);
}
