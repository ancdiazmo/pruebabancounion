package com.bancounion.pruebabancounion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bancounion.pruebabancounion.model.Department;

// The line `public interface IDepartmentRepository extends JpaRepository<Department, Integer>` is
// declaring an interface named `IDepartmentRepository` that extends the `JpaRepository` interface.
@Repository
public interface IDepartmentRepository extends JpaRepository<Department, Integer> {
    
}
