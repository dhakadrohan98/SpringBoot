package com.springrest.springbootrestapis.service;

import com.springrest.springbootrestapis.entity.Department;
import java.util.List;

public interface DepartmentService {

    //save department object
    public Department saveDepartment(Department department);

    //fetch all records from department table;
    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchByDepartmentName(String departmentName);
}
