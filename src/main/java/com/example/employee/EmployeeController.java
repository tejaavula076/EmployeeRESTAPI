package com.example.employee;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.employee.EmployeeService;
import com.example.employee.Employee;

/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */
@RestController
public class EmployeeController {
    EmployeeService a = new EmployeeService();

    @GetMapping("/employees")
    public ArrayList<Employee> getallemploye() {
        return a.getallemploye();
    }

    @PostMapping("/employees")
    public Employee addemployee(@RequestBody Employee addnewemployee) {
        return a.addemployee(addnewemployee);
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getemployeeparticularId(@PathVariable("employeeId") int employeeId) {
        return a.getemployeeparticularId(employeeId);

    }

    @PutMapping("/employees/{employeeId}")
    public Employee updateemployee(@PathVariable("employeeId") int employeeId, @RequestBody Employee getbodyemployee) {
        return a.updateemployee(employeeId, getbodyemployee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteemployee(@PathVariable("employeeId") int employeeId) {
        a.deleteemployee(employeeId);
    }
}
// Write your code here