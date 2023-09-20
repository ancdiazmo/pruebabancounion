package com.bancounion.pruebabancounion.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancounion.pruebabancounion.dto.DepartmentDTO;
import com.bancounion.pruebabancounion.dto.mappers.DepartmentDTOMapper;
import com.bancounion.pruebabancounion.model.Department;
import com.bancounion.pruebabancounion.repository.IDepartmentRepository;
import com.bancounion.pruebabancounion.service.interfaces.IDepartmentService;


/**
 * The DepartmentService class is responsible for retrieving, adding, and deleting departments from the
 * database using the DepartmentDTO data transfer object.
 */
@Service
public class DepartmentService implements IDepartmentService {

    private IDepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService (IDepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
    
    /**
     * The function retrieves a list of departments from the department repository and maps them to a
     * list of department DTOs.
     * 
     * @return The method is returning a list of DepartmentDTO objects.
     */
    @Override
    public List<DepartmentDTO> getDepartments () {
        List<Department> departments = departmentRepository.findAll();
        List<DepartmentDTO> departmentsDTOs = new ArrayList<> ();
        for (Department department : departments) {
            departmentsDTOs.add(DepartmentDTOMapper.mapper.entityToDTO(department));
        }
        return departmentsDTOs;
    }
    
    /**
     * The add function saves a DepartmentDTO object to the database and returns the corresponding
     * DepartmentDTO object.
     * 
     * @param departmentDTO The departmentDTO parameter is an object of type DepartmentDTO, which
     * represents the data transfer object for a department. It contains information such as the
     * department's name, description, and any other relevant details.
     * @return The method is returning a DepartmentDTO object.
     */
    @Override
    public DepartmentDTO add(DepartmentDTO departmentDTO) {
        Department department = departmentRepository.save(DepartmentDTOMapper.mapper.dtoToEntity(departmentDTO));
        return DepartmentDTOMapper.mapper.entityToDTO(department);
    }
    
    /**
     * The delete function deletes a department entity by converting the departmentDTO object to an
     * entity and calling the delete method of the departmentRepository.
     * 
     * @param departmentDTO The departmentDTO parameter is an object of type DepartmentDTO. It
     * represents the department that needs to be deleted.
     */
    @Override
    public void delete(DepartmentDTO departmentDTO) {
        departmentRepository.delete(DepartmentDTOMapper.mapper.dtoToEntity(departmentDTO));
    }
    
    /**
     * The function adds a department to the database using the PUT method and returns the
     * corresponding DepartmentDTO.
     * 
     * @param departmentDTO The departmentDTO parameter is an object of type DepartmentDTO, which
     * represents the data transfer object for a department. It contains information such as the
     * department's name, description, and any other relevant details.
     * @return The method is returning a DepartmentDTO object.
     */
    @Override
    public DepartmentDTO addByPut(DepartmentDTO departmentDTO) {
        Department department = departmentRepository.save(DepartmentDTOMapper.mapper.dtoToEntity(departmentDTO));
        return DepartmentDTOMapper.mapper.entityToDTO(department);
    }
}
