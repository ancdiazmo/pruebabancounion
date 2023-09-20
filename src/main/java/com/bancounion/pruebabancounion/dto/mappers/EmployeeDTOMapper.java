package com.bancounion.pruebabancounion.dto.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.bancounion.pruebabancounion.dto.EmployeeDTO;
import com.bancounion.pruebabancounion.model.Employee;

// The `public interface EmployeeDTOMapper` is defining a mapper interface using MapStruct library.
// This interface is responsible for mapping between `Employee` and `EmployeeDTO` objects. It declares
// two methods: `entityToDTO` and `dtoToEntity`, which define the mapping logic for converting an
// `Employee` object to an `EmployeeDTO` object and vice versa.
@Mapper
public interface EmployeeDTOMapper {

    // The line `EmployeeDTOMapper mapper = Mappers.getMapper(EmployeeDTOMapper.class);` is creating an
    // instance of the `EmployeeDTOMapper` interface using the `Mappers.getMapper()` method provided by
    // the MapStruct library. This instance can be used to invoke the mapping methods defined in the
    // `EmployeeDTOMapper` interface.
    EmployeeDTOMapper mapper = Mappers.getMapper(EmployeeDTOMapper.class);

    /**
     * The function converts an Employee entity object to an EmployeeDTO data transfer object.
     * 
     * @param department The "department" parameter is an instance of the Employee class, which
     * represents an employee in an organization.
     * @return The method is returning an EmployeeDTO object.
     */
    EmployeeDTO entityToDTO(Employee department);

    /**
     * The function converts an EmployeeDTO object to an Employee entity object.
     * 
     * @param departmentDTO This parameter is of type EmployeeDTO, which is a data transfer object
     * (DTO) representing an employee. It is used to transfer data between layers of an application,
     * such as between the presentation layer and the data access layer. The method is expected to
     * convert the EmployeeDTO object into an entity object,
     * @return The method is returning an Employee entity.
     */
    Employee dtoToEntity(EmployeeDTO departmentDTO);
}
