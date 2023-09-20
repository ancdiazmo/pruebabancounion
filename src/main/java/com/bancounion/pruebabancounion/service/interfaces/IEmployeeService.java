package com.bancounion.pruebabancounion.service.interfaces;

import java.util.List;

import com.bancounion.pruebabancounion.dto.EmployeeDTO;

// The line `public interface IEmployeeService {` is declaring an interface named `IEmployeeService`.
// An interface in Java is a collection of abstract methods that can be implemented by classes. In this
// case, the `IEmployeeService` interface defines a set of methods that a class can implement to
// provide functionality related to employees.
public interface IEmployeeService {

    /**
     * The function "getEmployees" returns a list of EmployeeDTO objects.
     * 
     * @return A List of EmployeeDTO objects is being returned.
     */
    public List<EmployeeDTO> getEmployees();

    /**
     * The add function adds an EmployeeDTO object to a collection.
     * 
     * @param employeeDTO The employeeDTO parameter is an object of type EmployeeDTO. It represents the
     * data of an employee that needs to be added.
     * @return The method is returning an EmployeeDTO object.
     */
    public EmployeeDTO add(EmployeeDTO employeeDTO);

    /**
     * The delete function takes an EmployeeDTO object as a parameter and deletes the corresponding
     * employee.
     * 
     * @param employeeDTO The employeeDTO parameter is an object of type EmployeeDTO. It represents the
     * employee that needs to be deleted.
     */
    public void delete(EmployeeDTO employeeDTO);

    /**
     * The addByPut function adds an EmployeeDTO object to a collection using the PUT HTTP method.
     * 
     * @param employeeDTO The employeeDTO parameter is an object of type EmployeeDTO. It represents the
     * data of an employee that needs to be added or updated.
     * @return The method is returning an EmployeeDTO object.
     */
    public EmployeeDTO addByPut(EmployeeDTO employeeDTO);
    
}
