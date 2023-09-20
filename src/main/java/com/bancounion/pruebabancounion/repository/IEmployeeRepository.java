package com.bancounion.pruebabancounion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bancounion.pruebabancounion.model.Employee;

// The line `public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {` is
// declaring an interface named `IEmployeeRepository` that extends the `JpaRepository` interface.
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    
}
