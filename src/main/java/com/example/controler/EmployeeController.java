package com.example.controler;

import com.example.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
class EmployeeController{


    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployee(){
        Employee emp = new Employee("Emp123","Rajeev");
        List<Employee> listEmployee = new ArrayList<>();
        listEmployee.add(emp);
        return listEmployee;
    }
}
