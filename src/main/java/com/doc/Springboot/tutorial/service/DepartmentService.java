package com.doc.Springboot.tutorial.service;

import com.doc.Springboot.tutorial.entity.Department;
import com.doc.Springboot.tutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);


    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long id, Department department);

    Department fetchDepartmentByName(String departmentName);
}
