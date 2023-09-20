package com.bancounion.pruebabancounion.dto.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.bancounion.pruebabancounion.dto.DepartmentDTO;
import com.bancounion.pruebabancounion.model.Department;

// The `public interface DepartmentDTOMapper` is defining a mapper interface using MapStruct library.
// This interface is responsible for mapping between `Department` and `DepartmentDTO` objects. It
// declares two methods: `entityToDTO` and `dtoToEntity`, which are used to convert `Department`
// objects to `DepartmentDTO` objects and vice versa.
@Mapper
public interface DepartmentDTOMapper {

    // The line `DepartmentDTOMapper mapper = Mappers.getMapper(DepartmentDTOMapper.class);` is
    // creating an instance of the `DepartmentDTOMapper` interface using the `Mappers.getMapper()`
    // method provided by the MapStruct library. This instance can be used to invoke the mapping
    // methods defined in the `DepartmentDTOMapper` interface.
    DepartmentDTOMapper mapper = Mappers.getMapper(DepartmentDTOMapper.class);


    /**
     * The function converts a Department entity object to a DepartmentDTO data transfer object.
     * 
     * @param department The department object that needs to be converted to a DepartmentDTO object.
     * @return The method is returning a DepartmentDTO object.
     */
    DepartmentDTO entityToDTO(Department department);


    /**
     * The function converts a DepartmentDTO object to a Department entity object.
     * 
     * @param departmentDTO This parameter is of type DepartmentDTO, which is a data transfer object
     * representing a department.
     * @return The method is returning an entity object of type Department.
     */
    Department dtoToEntity(DepartmentDTO departmentDTO);
}
