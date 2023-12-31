package com.codeship.springboot.repository;

import com.codeship.springboot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    public Department findByDepartmentName(String name);

//    @Query("SELECT * FROM department WHERE departmentName=:name AND departmentCode=:code"    )
//    public Department findByDepartmentNameAndCode(@Param("name") String name,@Param("code") String code);

    public Department findByDepartmentNameIgnoreCase(String name);
}
