package com.doc.Springboot.tutorial.service;

import com.doc.Springboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);


    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long id, Department department);
}
