package com.codeship.springboot.service;

import com.codeship.springboot.entity.Department;
import com.codeship.springboot.error.DepartmentNotFoundException;
import javassist.NotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}
