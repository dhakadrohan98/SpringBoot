package com.springrest.springbootrestapis.service;

import com.springrest.springbootrestapis.entity.Department;
import com.springrest.springbootrestapis.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return this.departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return this.departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return this.departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        this.departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department dep = this.departmentRepository.findById(departmentId).get();
        dep.setDepartmentName(department.getDepartmentName());
        dep.setDepartmentAddress(department.getDepartmentAddress());
        dep.setDepartmentCode(department.getDepartmentCode());
        return this.departmentRepository.save(dep);
    }

    @Override
    public Department fetchByDepartmentName(String departmentName) {
        try {
             return this.departmentRepository.findByDepartmentName(departmentName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
