package com.hindujatech.employe.management.controller;

import com.hindujatech.employe.management.entity.Employee;
import com.hindujatech.employe.management.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee_management")
@CrossOrigin("*")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    //http://localhost:8080/api/employee_management/save
    @PostMapping("/save")
    public Employee saveRecord(@Valid @RequestBody Employee employee){
        Employee employee1 = employeeService.saveEmployee(employee);
        return employee1;
    }
    //http://localhost:8080/api/employee_management/delete/1
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteRecord(@PathVariable(value = "id") Long id){
        Employee existEmployee = employeeService.getEmployeeById(id);
        if(existEmployee.equals(null))
            return ResponseEntity.notFound().build();
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok().build();
    }
    //http://localhost:8080/api/employee_management/update/2
    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateRecord(@PathVariable(value = "id") Long id, @RequestBody Employee employee){
        Employee existEmployee = employeeService.getEmployeeById(id);
        if(existEmployee == null)
            return ResponseEntity.notFound().build();
        existEmployee.setEmpNo(employee.getEmpNo());
        existEmployee.setEmpName(employee.getEmpName());
        existEmployee.setMobile(employee.getMobile());
        existEmployee.setEmail(employee.getEmail());
        Employee updateEmployee = employeeService.updateEmployee(existEmployee);
        return ResponseEntity.ok(updateEmployee);
    }
    //http://localhost:8080/api/employee_management/getRecord
    @GetMapping("/getRecord")
    public List<Employee> getRecord(){
            return employeeService.getAllEmployee();
    }
    @GetMapping("/getRecordById/{id}")
    public ResponseEntity<Employee>  getRecordById(@PathVariable(value = "id") Long id){
        Employee employeeById = employeeService.getEmployeeById(id);
        if(employeeById==null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(employeeById);
    }
}