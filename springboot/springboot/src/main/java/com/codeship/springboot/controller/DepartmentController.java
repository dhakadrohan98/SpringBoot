package com.codeship.springboot.controller;

import com.codeship.springboot.entity.Department;
import com.codeship.springboot.service.DepartmentService;
import jakarta.validation.Valid;
import javassist.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/create/department")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("Inside saveDepartment() method of Department Controller");
        return departmentService.saveDepartment(department);
    }

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        LOGGER.info("inside fetchDepartmentList() of Department Controller");
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
        try {
            LOGGER.info("inside fetchDepartmentById() of Department Controller");
            return departmentService.fetchDepartmentById(departmentId);
        } catch (NotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping("/departments/{id}")
    public  String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        LOGGER.info("inside deleteDepartmentById() of Department Controller");
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department) {
        LOGGER.info("inside updateDepartment() of Department Controller");
        return departmentService.updateDepartment(departmentId,department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
        LOGGER.info("inside fetchDepartmentByName() of Department Controller");
        return departmentService.fetchDepartmentByName(departmentName);
    }

}
