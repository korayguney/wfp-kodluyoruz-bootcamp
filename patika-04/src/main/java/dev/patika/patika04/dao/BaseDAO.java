package dev.patika.patika04.dao;

import dev.patika.patika04.exception.EmployeeAlreadyExistException;

import java.util.List;

public interface BaseDAO<T> {
    List<T> findAll();
    T findById(int id);
    T save(T object) throws EmployeeAlreadyExistException;
    void deleteById(int id);
    T update(T object);
}
