package com.bancounion.pruebabancounion.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancounion.pruebabancounion.dto.EmployeeDTO;
import com.bancounion.pruebabancounion.service.interfaces.IEmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("EmployeeController")
@Slf4j
public class EmployeeController {
    
    @Autowired
    private IEmployeeService employeeService;

    /**
     * Gets All the Employees
     * 
     * @return DepartmentDTO
     */
    @GetMapping("/getAll")
    public List<EmployeeDTO> getAll () {
        return employeeService.getEmployees();
    }

    /**
     * Adds an Employee
     * 
     * @return DepartmentDTO
     */
    @PostMapping("/add")
    public ResponseEntity<EmployeeDTO> add (@Valid @RequestBody EmployeeDTO employeeDTO) {
        log.info("Saving data by post: " + employeeDTO);
        employeeDTO = employeeService.add(employeeDTO);
        return new ResponseEntity<> (employeeDTO, HttpStatus.OK);
    }

    /**
     * Deletes an Employee
     * 
     * @return DepartmentDTO
     */
    @DeleteMapping("/delete")
    public ResponseEntity<EmployeeDTO> delete (@RequestBody EmployeeDTO employeeDTO) {
        log.info("Deleting data: " + employeeDTO);
        employeeService.delete(employeeDTO);
        return new ResponseEntity<> (HttpStatus.OK);
    }

    /**
     * Adds an Employee
     * 
     * @return DepartmentDTO
     */
    @PutMapping("/addByPut")
    public ResponseEntity<EmployeeDTO> addByPut (@Valid @RequestBody EmployeeDTO employeeDTO) {
        log.info("Saving data by put: " + employeeDTO);
        employeeDTO = employeeService.addByPut(employeeDTO);
        return new ResponseEntity<> (employeeDTO, HttpStatus.OK);
    }
}
