package com.bancounion.pruebabancounion.service.interfaces;

import java.util.List;

import com.bancounion.pruebabancounion.dto.DepartmentDTO;

// The line `public interface IDepartmentService {` is declaring an interface named
// `IDepartmentService`. An interface in Java is a collection of abstract methods that can be
// implemented by classes. In this case, the `IDepartmentService` interface defines a set of methods
// that a class can implement to provide functionality related to departments.
public interface IDepartmentService {
    
    /**
     * The function "getDepartments" returns a list of DepartmentDTO objects.
     * 
     * @return A List of DepartmentDTO objects is being returned.
     */
    public List<DepartmentDTO> getDepartments ();

    /**
     * The add() function in Java adds a DepartmentDTO object to a collection.
     * 
     * @param departmentDTO The parameter "departmentDTO" is of type DepartmentDTO, which is a data
     * transfer object representing a department. It is used to pass the department information to the
     * "add" method.
     * @return The add method is returning a DepartmentDTO object.
     */
    public DepartmentDTO add(DepartmentDTO departmentDTO);

    /**
     * The delete function takes a DepartmentDTO object as a parameter and deletes the corresponding
     * department.
     * 
     * @param departmentDTO The departmentDTO parameter is an object of type DepartmentDTO. It
     * represents the department that needs to be deleted.
     */
    public void delete(DepartmentDTO departmentDTO);

    /**
     * The addByPut function adds a DepartmentDTO object to the system.
     * 
     * @param departmentDTO The parameter "departmentDTO" is an object of type DepartmentDTO. It
     * represents the department data that needs to be added or updated.
     * @return The method is returning a DepartmentDTO object.
     */
    public DepartmentDTO addByPut(DepartmentDTO departmentDTO);
}
