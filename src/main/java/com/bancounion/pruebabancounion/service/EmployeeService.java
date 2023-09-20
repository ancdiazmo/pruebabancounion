package com.bancounion.pruebabancounion.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancounion.pruebabancounion.dto.EmployeeDTO;
import com.bancounion.pruebabancounion.dto.mappers.EmployeeDTOMapper;
import com.bancounion.pruebabancounion.model.Employee;
import com.bancounion.pruebabancounion.repository.IEmployeeRepository;
import com.bancounion.pruebabancounion.service.interfaces.IEmployeeService;


/**
 * The EmployeeService class implements the IEmployeeService interface and provides methods for
 * retrieving, adding, and deleting employees from the employee repository.
 */
@Service
public class EmployeeService implements IEmployeeService {

    private IEmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService (IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    /**
     * The function retrieves a list of employees from the employee repository and maps them to a list
     * of employee DTOs.
     * 
     * @return The method is returning a List of EmployeeDTO objects.
     */
    @Override
    public List<EmployeeDTO> getEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        List<EmployeeDTO> employeesDTOs = new ArrayList<> ();
        for (Employee employee : employees) {
            employeesDTOs.add(EmployeeDTOMapper.mapper.entityToDTO(employee));
        }
        return employeesDTOs;
    }
    
    /**
     * The add function saves an EmployeeDTO object as an Employee entity in the repository and returns
     * the corresponding EmployeeDTO object.
     * 
     * @param employeeDTO The employeeDTO parameter is an object of type EmployeeDTO, which represents
     * the data of an employee.
     * @return The method is returning an EmployeeDTO object.
     */
    @Override
    public EmployeeDTO add(EmployeeDTO employeeDTO) {
        Employee employee = employeeRepository.save(EmployeeDTOMapper.mapper.dtoToEntity(employeeDTO));
        return EmployeeDTOMapper.mapper.entityToDTO(employee);
    }
    
    /**
     * The delete function deletes an employee from the employee repository by converting the
     * employeeDTO object to an entity object and then calling the delete method on the employee
     * repository.
     * 
     * @param employeeDTO The employeeDTO parameter is an object of type EmployeeDTO. It represents the
     * employee that needs to be deleted from the employee repository.
     */
    @Override
    public void delete(EmployeeDTO employeeDTO) {
        employeeRepository.delete(EmployeeDTOMapper.mapper.dtoToEntity(employeeDTO));
    }
    
    /**
     * The function adds an employee to the repository using the PUT method and returns the
     * corresponding EmployeeDTO.
     * 
     * @param employeeDTO An object of type EmployeeDTO that contains the data of the employee to be
     * added.
     * @return The method is returning an EmployeeDTO object.
     */
    @Override
    public EmployeeDTO addByPut(EmployeeDTO employeeDTO) {
        Employee employee = employeeRepository.save(EmployeeDTOMapper.mapper.dtoToEntity(employeeDTO));
        return EmployeeDTOMapper.mapper.entityToDTO(employee);
    }
    
}
