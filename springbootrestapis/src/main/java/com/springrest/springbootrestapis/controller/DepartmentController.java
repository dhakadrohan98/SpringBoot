package com.springrest.springbootrestapis.controller;

import com.springrest.springbootrestapis.entity.Department;
import com.springrest.springbootrestapis.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/create/department")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("inside saveDepartment controller method");
        return this.departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        LOGGER.info("inside fetchDepartmentList contoller method");
        return this.departmentService.fetchDepartmentList();
    }

    @GetMapping("/department/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
        LOGGER.info("inside fetchDepartmentById contoller method");
        return this.departmentService.fetchDepartmentById(departmentId);
    }

    @GetMapping("/department/name/{name}")
    public Department fetchByDepartmentName(@PathVariable("name") String departmentName) {
        LOGGER.info("inside fetchByDepartmentName contoller method");
        return this.departmentService.fetchByDepartmentName(departmentName);
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
        LOGGER.info("inside updateDepartment contoller method");
        return this.departmentService.updateDepartment(departmentId, department);
    }

    @DeleteMapping("/departments/{id}")
    public void deleteDepartmentById(@PathVariable("id") Long departmentId) {
        LOGGER.info("inside deleteDepartmentById contoller method");
        this.departmentService.deleteDepartmentById(departmentId);
    }
}
