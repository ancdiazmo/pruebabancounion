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

import com.bancounion.pruebabancounion.dto.DepartmentDTO;
import com.bancounion.pruebabancounion.service.interfaces.IDepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("DepartmentController")
@Slf4j
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentService;

    /**
     * Gets All the departments
     * 
     * @return DepartmentDTO
     */
    @GetMapping("/getAll")
    public List<DepartmentDTO> getAll () {
        return departmentService.getDepartments();
    }
    
    /**
     * Adds a departments
     * 
     * @return ResponseEntity<DepartmentDTO>
     */
    @PostMapping("/add")
    public ResponseEntity<DepartmentDTO> add (@Valid @RequestBody DepartmentDTO departmentDTO) {
        log.info("Saving data by post: " + departmentDTO);
        departmentDTO = departmentService.add(departmentDTO);
        return new ResponseEntity<> (departmentDTO, HttpStatus.OK);
    }

    /**
     * Deletes a department
     * 
     * @return ResponseEntity<DepartmentDTO>
     */
    @DeleteMapping("/delete")
    public ResponseEntity<DepartmentDTO> delete (@RequestBody DepartmentDTO departmentDTO) {
        log.info("Deleting data: " + departmentDTO);
        departmentService.delete(departmentDTO);
        return new ResponseEntity<> (HttpStatus.OK);
    }

    /**
     * Adds a department by put
     * 
     * @return ResponseEntity<DepartmentDTO>
     */
    @PutMapping("/addByPut")
    public ResponseEntity<DepartmentDTO> addByPut (@Valid @RequestBody DepartmentDTO departmentDTO) {
        log.info("Saving data by put: " + departmentDTO);
        departmentDTO = departmentService.addByPut(departmentDTO);
        return new ResponseEntity<> (departmentDTO, HttpStatus.OK);
    }
}
