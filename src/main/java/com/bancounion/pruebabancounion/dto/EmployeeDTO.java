package com.bancounion.pruebabancounion.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.bancounion.pruebabancounion.model.Department;

/**
 * The EmployeeDTO class represents an employee with properties such as id, name, salary, and
 * department.
 */
public class EmployeeDTO {
    
    private int id;
    @NotBlank(message = "EmployeeDTO.name shouldn't be blank")
	private String name;
    @NotNull(message = "EmployeeDTO.salary shouldn't be null")
	private int salary;
    @NotNull(message = "EmployeeDTO.department shouldn't be null")
    private Department department;

    public EmployeeDTO() {
        
    }

    public EmployeeDTO(int id, String name, int salary, Department department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "EmployeeDTO [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + salary;
        result = prime * result + ((department == null) ? 0 : department.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EmployeeDTO other = (EmployeeDTO) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (salary != other.salary)
            return false;
        if (department == null) {
            if (other.department != null)
                return false;
        } else if (!department.equals(other.department))
            return false;
        return true;
    }

}
