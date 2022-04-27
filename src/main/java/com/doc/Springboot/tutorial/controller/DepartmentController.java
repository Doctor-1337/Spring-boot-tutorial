package com.doc.Springboot.tutorial.controller;


import com.doc.Springboot.tutorial.entity.Department;
import com.doc.Springboot.tutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return service.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return service.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id")  Long departmentId){
        return service.fetchDepartmentById(departmentId);
    }
}
